package nong;
import java.util.Scanner; 

interface Shape { 
    double calculateArea(); 
} 
 
class Rectangle implements Shape { 
    private double width;  
    private double length;    
    public Rectangle(double length, double width) {  
        this.length = length;  
        this.width = width;  
    } 
    public double calculateArea(){
    return length*width;
    }
} 

class Circle implements Shape { 
    private double radius; 
    public Circle(double radius) { 
        this.radius = radius; 
    } 
    public double calculateArea(){
        return Math.PI*(Math.pow(radius,radius));
        }
} 
public class Main1 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        String shapeType = scanner.nextLine(); 
 
        Shape shape; 
        if (shapeType.equalsIgnoreCase("rectangle")) { 
            double length = scanner.nextDouble(); 
            double width = scanner.nextDouble(); 
            shape = new Rectangle(length, width); 
        } else if (shapeType.equalsIgnoreCase("circle")) { 
            double radius = scanner.nextDouble(); 
            shape = new Circle(radius); 
        } else { 
            System.out.println("Invalid shape type!"); 
            return; 
        } 
        double area = shape.calculateArea(); 
        System.out.printf("%.2f\n", area); 
    } 
}