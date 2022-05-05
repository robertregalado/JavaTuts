public class Point {
   // Objects represent points in the cartesian plane
   
   double x, y;  // the point's coordinates

   Point(double a, double b)
   { x = a;
     y = b;       
   }

   public Object clone()
   { return new Point(x, y);
   }

   public boolean equals(Object p)
   { if (p instanceof Point)
        return (x == ((Point)p).x && y == ((Point)p).y);
    else return false;
   }

   public String toString()
   { return new String("(" + x + ", " + y + ")");
   }
}

class TestPoint
{ public static void main(String[] args) 
    {
        Point p = new Point(2, 3);
        System.out.println("p = " + p);
        Point q = (Point)p.clone();
        System.out.println("q = " + q);
        if (q == p) System.out.println("q == p");
        else System.out.println("q != p");
        if (q.equals(p)) System.out.println("q equals p");
        else System.out.println("q does not equal p");
    }

}
