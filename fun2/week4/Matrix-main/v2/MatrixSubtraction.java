public class MatrixSubtraction {
    public static int[][] Sub(int[][] a, int[][] b) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }
}
