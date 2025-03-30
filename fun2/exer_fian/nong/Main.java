import java.util.*;

public class Main {

    public static void main(String[] args) {
        //S มีค่าเท่ากับ (X1 + X2)/2
        //x2=2s-x1
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] mix = text.split(" ");
        System.out.println(2 * (Integer.parseInt(mix[1])) - (Integer.parseInt(mix[0])));
        // ArrayList<String> objj = new ArrayList<>();
        // try {
        //     File obj = new File("test1.txt");
        //     Scanner sc = new Scanner(obj);
        //     while (sc.hasNextLine()) {

        //         String text = sc.nextLine();
        //         String[] mix = text.split(" ");
        //         for (int i = 0; i < mix.length; i++) {
        //             objj.add(mix[i]);
        //         }
        //         System.out.println(2 * (Integer.parseInt(objj.get(1))) - (Integer.parseInt(objj.get(0))));
        //     }
        // } catch (FileNotFoundException e) {
        //     System.out.println("not found file");
        // }

    }
}
