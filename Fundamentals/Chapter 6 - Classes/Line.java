public class Line {
   //Objects represent lines in the cartesian plane
   
   private Point p0; // a point on the line
   private double m; // the slope of the line

   // constructor
   public Line(Point p, double s){
       p0 = p;
       m = s;
   }

   public double slope(){
       return m;
   }

   public double yIntercept(){
       return (p0.y() - m*p0.x());
   }

   public boolean equals(Line line){
       return (slope() == line.slope() && yIntercept() == line.yIntercept());
   }

   public String toString(){
       return new String("y = " + (float)m + "x + " + (float)yIntercept());
   }

   public static void main(String[] args) {
       Point p = new Point(5, -4);
       Line line1 = new Line(p, -2);
       System.out.println("\nThe equation of the line 1 is " + line1);
       System.out.println("Its slope is " + line1.slope() + " and its y-intercept is " + 
       line1.yIntercept());
       Line line2 = new Line(p, -1);
       System.out.println("\nThe equation of the line 2 is " + line2);
       System.out.println("Its slope is " + line2.slope() + " and its y-intercept is " + line2.yIntercept());
       if (line2.equals(line1)) System.out.println("They are equal.");
       else System.out.println("They are not equal.");
       Point q = new Point(2, 2);
       line2 = new Line(q,-2);
       System.out.println("\nThe equation of the line is " + line2);
       System.out.println("Its slope is " + line2.slope() + " and its y-intercept is " + line2.yIntercept());
       if (line2.equals(line1)) System.out.println("They are equal.");
       else System.out.println("They are not equal.");


   }

   
}

