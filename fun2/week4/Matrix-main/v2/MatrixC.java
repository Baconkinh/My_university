public class MatrixC {
    public static int[][] cee(int[][] a,int c) {
 
            int[][] result = new int[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    result[i][j] = a[i][j]*c; 
                }
            }
            return result;

        }
    
    
}
