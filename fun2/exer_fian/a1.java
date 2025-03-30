import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> output=new ArrayList<>();
        //System.out.println(".....");
        for (int i = 0; i < 3; i++) {
            int scan = sc.nextInt();
            list.add(scan);
        }
        sc.nextLine();
        Collections.sort(list);
        String scan = sc.nextLine();
        //System.out.println(list);
        //System.out.println(".....");
       for(char ch:scan.toCharArray()){
        if(Character.toString(ch).equals("A")){
            output.add(list.get(0));
        }else if(Character.toString(ch).equals("B")){
            output.add(list.get(1));
        }else if(Character.toString(ch).equals("C")){
            output.add(list.get(2));
        }
       }for (int obj : output) {
           System.out.print(obj+" ");
       }
        
    }
}

