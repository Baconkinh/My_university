import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Input = sc.nextInt();
        float input=(float)Input;
        
        System.out.println(input+" USD");
        System.out.print((input*35)+" THB");
    }
}
