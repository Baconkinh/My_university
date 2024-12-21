public class Vector {
    private double x;
    private double y;
 
    public Vector(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getLength(){
        return Math.sqrt((x*x) + (y*y));
    }
    public double getDirection(){
        return Math.atan2(y, x);
    }
    public double dot(Vector v){
        return (x * v.x) + (y * v.y) ;
    }
    public Vector getUnitVector(){
        double x1 = x/getLength();
        double y1 = y/getLength();
        return new Vector(x1,y1);
    }

    public void print(){
        System.out.printf("Vector: %.2fi + %.2fj\n" , x,y);
    }
}
