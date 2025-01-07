package v1;

public class matrix_all_in_one {
    public static void main(String[] args) {
        int[][] matrixA = {{1, 2}, {3, 4}};
        int[][] matrixB = {{1, 2}, {3, 4}};
        int c = 2;

        
        System.out.println("Matrix A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }

        
        System.out.println("\nMatrix B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.println();
        }

        //+
        System.out.println("\nA + B =");
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
//-
        System.out.println("\nA - B =");
        int[][] result1 = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result1[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result1[i][j] + " ");
            }
            System.out.println();
        }
        
//transport
        System.out.println("\nTransposed Matrix:");
                int[][] result2= new int[2][2];

                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result2[j][i] = matrixA[i][j];
                    }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result2[i][j] + " ");
            }
            System.out.println();
}
        System.out.println("\nA*c");
        int[][] result3 = new int[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    result3[i][j] = matrixA[i][j]*c; 
                }
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(result3[i][j] + " ");
                }
                System.out.println();

        }

        System.out.println("\nMatrix A x B:");
        int[][] result4 = new int[2][2];
    
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    for (int k = 0; k < 2; k++) {
                        result[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(result4[i][j] + " ");
                }
                System.out.println();


    }
}}
