public class PolarVector {
 
    private double length,direction;
 
    public PolarVector(double length , double direction) {
        this.length = length;
        this.direction = direction;
    }
 
 
    public double getProjectionX() {
        return length * Math.cos(direction);
    }
 
    public double getProjectionY() {
        return length * Math.sin(direction);
    }
 
    public Vector toVector(){
        double x = getProjectionX();
        double y = getProjectionY();
        return new Vector(x, y);
    }
 
    public void print() {
        System.out.printf("PolarVector: %.2f<%.2f\n", length,direction);
    }
 
    public double getLength() {
        return length;
    }
 
    public double getDirection() {
        return direction;
    }
}