public class ArrayResizer {  
public static boolean isNonZeroRow(int[][] array2D, int r) { 
    boolean shifted = true;
    for (int col = 0; col < array2D[0].length; col++) {
        if (array2D[r][col] == 0) shifted = false;
    }

    return shifted;
}  
  
public static int numNonZeroRows(int[][] array2D) { 
    int count = 0;
    for (int[] rows : array2D) {
        boolean shifter = true;
        for (int col : rows) {
            if (col == 0) shifter = false;
        }
        if (shifter == true) count++;
    }
    return count;
}  
  
public static int[][] resize(int[][] array2D) {  
    int[][] result = new int[numNonZeroRows(array2D)][array2D[0].length];
    int r = 0;
    for (int row = 0; row < array2D.length; row++) {
        if (isNonZeroRow(array2D, row) == true) {
            for (int col = 0; col < array2D[0].length; col++) {
                result[r][col] = array2D[row][col];
            }
            r++;
        }
    }
    return result;
}  
}  
