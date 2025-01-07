public class Matrixcross {

        public static int[][] multiply(int[][] A, int[][] B) {
            int rowsA = A.length;
            int colsA = A[0].length;
            int rowsB = B.length;
            int colsB = B[0].length;
    
            if (colsA != rowsB) {
                throw new IllegalArgumentException("Number of columns in A must equal number of rows in B");
            }
    
            int[][] result = new int[rowsA][colsB];
    
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    for (int k = 0; k < colsA; k++) {
                        result[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
    
            return result;
        }
    }
    

