import java.util.Scanner;

public class math_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A =");
        double a= sc.nextDouble();
        System.out.print("B =");
        double b= sc.nextDouble();

        double absA =Math.abs(a);
        double max =Math.max(a,b);
        double aTob =Math.pow(a, b);
        System.out.println("abs"+absA);
        System.out.println("max"+max);
        System.out.println("aTob"+aTob);
    }
}
