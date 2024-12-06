**Java**

try-catch ใน Java คือการจัดการข้อผิดพลาดที่อาจเกิดขึ้นในระหว่างการทำงานของโปรแกรม (Runtime Error) โดยแบ่งเป็น 2 ส่วนหลักคือ try สำหรับโค้ดที่อาจทำให้เกิดข้อผิดพลาด และ catch สำหรับจัดการข้อผิดพลาดนั้น

try {
    // โค้ดที่อาจทำให้เกิดข้อผิดพลาด
} catch (ExceptionType e) {
    // โค้ดสำหรับจัดการข้อผิดพลาด
}

try: ใส่โค้ดที่อาจเกิดข้อผิดพลาด เช่น การแปลง String เป็น int
catch: ใช้จับข้อผิดพลาดที่เกิดขึ้น และสามารถแสดงข้อความหรือทำการแก้ไขปัญหาได้
ExceptionType: ระบุประเภทของข้อผิดพลาดที่ต้องการจับ เช่น NumberFormatException หรือ IOException
e: ตัวแปรสำหรับเก็บรายละเอียดข้อผิดพลาด
**ตัวอย่าง**
import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        try {
            String input = scanner.nextLine();
            int number = Integer.parseInt(input); // อาจเกิด NumberFormatException
            System.out.println("You entered: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        }

        scanner.close();
    }
}

ผลลัพธ์:

ถ้าผู้ใช้ใส่ 123 จะพิมพ์ You entered: 123
ถ้าผู้ใช้ใส่ abc จะพิมพ์ Invalid input! Please enter a valid number.
