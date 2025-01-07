
public class MatrixCalculator {

    public static void main(String[] args) {
        
        int[][] matrixA = {{1, 2}, {3, 4}};
        int[][] matrixB = {{1, 2}, {3, 4}};
        int c=2;

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
        
        System.out.println("\nA + B =");
        int[][] matrixAdd = MatrixAdd.add(matrixA, matrixB);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrixAdd[i][j] + " ");
            }
            System.out.println();


        }

        System.out.println("\nA - B =");
        int[][] matrixSub = MatrixSubtraction.Sub(matrixA, matrixB);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrixSub[i][j] + " ");
            }
            System.out.println();


        }
        System.out.println("\nTransposed Matrix:");
        int[][] transposedMatrix = MatrixTranspose.transpose(matrixA);
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nA*c");
        int[][] matrixCee = MatrixC.cee(matrixA, c);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrixCee[i][j] + " ");
            }
            System.out.println();
    }
    System.out.println("\nMatrix A x B:");
            int[][] matrixCross = Matrixcross.multiply(matrixA, matrixB);
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(matrixCross[i][j] + " ");
                }  
        }
}
}