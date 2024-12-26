package shape;

public class Rectangle {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width) {
        this.width = width;
        this.height = width;
    }

    public Rectangle() {
        this(1.);
    }

    public double area() {
        return width * height;
    }
}
