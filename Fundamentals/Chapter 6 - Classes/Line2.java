public class Line2 {
     // Objects represent lines in the cartesian plane 
// Class invariant: either pO.x() == 0 or pO.y() == 0 
// enforced by the normalize() method 
private Point p0; // a point on the line 
private double m; // the slope of the line 
public Line2(Point p, double s) 
{ p0 = p; 
m = s; 
normalize(); 
}

public Line2(Point p, Point q) 
{ p0 = p; 
m = (p.y() - q.y())/(p.x() - q.x()); 
normalize(); 
}

public Line2(double a, double b) 
{ p0 = new Point(0,b); 
m = -b/a; 
normalize(); 
}

public double slope () 
{ 
    return m;
}

public double xIntercept() 
{ return (0.0 - p0.y()/m); 
}
public double yIntercept () 
{ return (p0.y() - p0.x()*m); 
}
public boolean equals(Line2 line) 
{ return (m == line.m && yIntercept() == line.yIntercept()); 
}
public boolean isHorizontal() 
{ return (m == 0.0); 
} 
public boolean isvertical() 
{ return (m == Double.POSITIVE_INFINITY || m == Double.NEGATIVE_INFINITY); 
}
public String tostring() 
{ float a = (float)xIntercept() ; 
float b = (float)yIntercept(); 
float fm = (float)m; 
if (isHorizontal()) return new String("y = " + b);
if (isvertical()) return new String("x = " + a);
if (yIntercept() == 0) return new String("y = " + fm + "x"); 
return new String("y = " + fm + " x + " + yIntercept()); 
}
private void normalize() 
{ // enforces class invariant 
if (isHorizontal()) p0 = new Point(0,yIntercept()); 
else if (isvertical()) p0 = new Point(xIntercept(),0); 
else if (yIntercept() == 0) p0 = new Point(1,m); 
else p0 = new Point(0,yIntercept()); 
}
public static void main(String[] args) 
{ Point pl = new Point(5,-4); 
Point p2 = new Point(1,4); 
Line2 line1 = new Line2(pl,-2); 
Line2 line2 = new Line2(pl,p2); 
Line2 line3 = new Line2(3,6); 
print(line1, line2); 
print(line1, line3); 
print (line2 , line2); 
}

private static void print(Line2 line1, Line2 line2) 
{
    System.out.print("Lines (" + line1 + ") and (" + line2);
    if (line1.equals(line2)) System.out.println(") + are equal.");
    else System.out.println(") are not equal.");
    }
}
