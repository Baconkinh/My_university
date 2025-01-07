public class Daytest {
    public static void main(String[] args) {
        Day today = Day.friday;
        switch (today) {
            case Day.friday :
                System.out.println("friday");
                break;
            default:
                System.out.println("fine");
        }
    }
    
}
