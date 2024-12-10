import java.util.Scanner;

public class ZodiacYear {
    public static void main(String[] args) {
        String zodia = null;
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Year of Birth: ");
        int birth = scanner.nextInt(); 
        
        if (birth<=0){
            System.out.print("Invalid input!");
        }else{
            System.out.print("Current Year: ");
            int Current = scanner.nextInt();
        int a=Current-birth;
        if(Current==birth){
            a=0;
        }
        if(Current<birth || Current<=0 ||birth<=0){
            System.out.print("Invalid input!");
        }
        else{
            int zodiacYear =(birth+543)%12;
            if(zodiacYear==0){
                zodia="Snake";
            }else if(zodiacYear==6){
                zodia="Pig";
            }else if(zodiacYear==1){
                zodia="Horse";
            }else if(zodiacYear==2){
                zodia="Goat";
            }else if(zodiacYear==3){
                zodia="Monkey";
            }else if(zodiacYear==4){
                zodia="Rooster";
            }else if(zodiacYear==5){
                zodia="Dog";
            }else if(zodiacYear==7){
                zodia="Rat";
            }else if(zodiacYear==8){
                zodia="Ox";
            }else if(zodiacYear==9){
                zodia="Tiger";
            }else if(zodiacYear==10){
                zodia="Rabbit";
            }else if(zodiacYear==11){
                zodia="Dragon";
            }
        scanner.nextLine(); 
        System.out.print("Name: ");
        String name = scanner.nextLine();
            System.out.println(name+" was born in the year of the "+ zodia +" and is now "+(a)+" years old.");
        }
        }
        
        
       
    }
    
}