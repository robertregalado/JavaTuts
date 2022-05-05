public class Line1 {
    // Objects represent lines in the cartesian plane

    private Point p0; // a point on the line
    private double m; // the slope of the line

    public Line1(Point p, double s){
        p0 = p;
        m = s;
    }

    public Line1(Point p, Point q){
        p0 = p;
        m = (p.y() - q.y()) / (p.x() - q.x());
    }

    public Line1(double a, double b){
        p0 = new Point(0, b);
        m = -b/a;
    }

    public double slope(){
        return m;
    }

    public double yIntercept(){
        return (p0.y() - p0.x()*m);
    }

    public boolean equals(Line1 line){
        return (slope() == line.slope() && yIntercept() == line.yIntercept());
    }

    public String toString()
    {
        return new String("y = " + (float)m + "x + " + (float)yIntercept());
    }
   public static void main(String[] args) {
       Point p1 = new Point(5, -4);
       Line1 line1 = new Line1(p1, -2);
       System.out.println("The equation of the line 1 is " + line1);
       Point p2 = new Point(-1, 2);
       Line1 line2 = new Line1(p1, p2);
       System.out.println("The equation of the line 2 is " + line2);
       if (line2.equals(line1)) System.out.println("They are equal. ");
       else System.out.println("They are not equal");
       Line1 line3 = new Line1(3, 6);
       System.out.println("The equation of the line 3 is " + line3);
   } 
}
