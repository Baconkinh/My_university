import java.util.Scanner;

public class MeanAndSd {
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.print("N: ");
    int n=scanner.nextInt();
    float[] x = new float[n];
    float sdx=0;
    float mean=0;
    float sumx=0;
    if(n>1 && n<100){
        for (int idx = 0; idx < n; idx++) {
            System.out.print("Number "+(idx+1)+": ");
            x[idx] = scanner.nextFloat();
            if(x[idx]>Math.pow(10,6) ||x[idx]<=((-1)*(Math.pow(10,6))) ){
                System.out.print("Input out of range!");
                return;
            }else{
                sumx=sumx+x[idx];
            }
        }
        
        mean=(sumx/n);
        for (int idx = 0; idx < n; idx++){
            sdx += Math.pow(x[idx]-mean, 2);
        }
        System.out.printf("Mean = %.2f%n",mean);
        System.out.printf("SD = %.2f%n",(Math.sqrt(sdx/ (n-1))));
    }else{
        System.out.print("Input out of range!");
    }
    
}}
    