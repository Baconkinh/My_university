public class Vector {
    private double x,y;
 
    
    public Vector(double a , double b) {
        this.x = a;
        this.y = b;
    }
 
    public double getLength(){
        return  Math.sqrt((x*x) + (y*y));
    }
 
    public double getDirection(){
        return Math.atan2(y, x);
    }
 
    public PolarVector toPolarVector(){
        double length = getLength();
        double direction = getDirection();
        return new PolarVector(length, direction);
    }
 
 
    public void print(){
        System.out.printf("Vector: %.2fi + %.2fj\n" , x , y);
    }
 
}