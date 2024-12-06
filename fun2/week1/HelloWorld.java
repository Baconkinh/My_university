import java.util.Scanner;


public class HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        String name =scan.nextLine();
        System.out.print("age :");
        int age =scan.nextInt();

        System.out.println("Hello, "+name+" !");
        if(age>=18){
            System.out.print("You may enter our site.");
        }else{
            System.out.print("you are not allow!!!!!");
        }

    }
}