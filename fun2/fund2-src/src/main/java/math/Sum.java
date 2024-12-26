package math;

public class Sum {
    public static int sum(int x, int y) {
        return x + y;
    }   
    public static int sum(int x, int y, int z) {
        return x + y + z;
    }
    public static int sum(int[] arr) {
        int sigma = 0;
        for (int i = 0; i < arr.length; i++) {
            sigma += arr[i];
        }
        return sigma;
    }
    public static double sum(double x, double y) {
        return x + y;
    }   
    public static double sum(double x, double y, double z) {
        return x + y + z;
    }
    public static double sum(double[] arr) {
        double sigma = 0.;
        for (double elem : arr) {
            sigma += elem;
        }
        return sigma;
    }
    public static void main(String[] args) {
        double[] arr = {1.0, 2.0, 3.0, 4.5, 8.8};
        System.out.println("Sum = " + sum(arr));
    }
}