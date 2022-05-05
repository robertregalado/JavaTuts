public class Point {
    // instance or attributes variables
    private double x, y;

    // constructor or initialization
    public Point(double a, double b){
        x = a;
        y = b;
    }
    // methods
    public double x()
    {
        return x;
    } 
    
    public double y()
    {
        return y;
    }

    public boolean equals(Point p){
        return (x == p.x && y == p.y);
    }

    public String toString(){
       return new String("(" + x + ", " + y + ")");
    }
    public static void main(String[] args) {
        Point p = new Point(2, 3);
        System.out.println("p.x() = " + p.x() + ", p.y() = " + p.y());
        System.out.println("p = " + p);
        Point q = new Point(7,4); 
        System.out.println("q= " + q);
        if (q.equals(p) ) System.out.println("q equals p"); 
        else System.out.println("q does not equal to p"); 
        q = new Point(2,3); 
        System.out.println("q= " + q);
        if (q.equals(p) ) System.out.println("q equals p") ; 
        else System.out.println("q does not equal to p") ; 
    }
}