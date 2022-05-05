abstract class Shape
{ // Objects represent geometric shapes in the cartesian plane
    abstract Point center();
    abstract double diameter();
    abstract double area();
}

class Circle extends Shape
{ // Objects represent circles in the cartesian plane
    private Point center;
    private double radius;

    Circle(Point center, double radius)
    {
        this.center = center;
        this.radius = radius;
    }

    Point center()
    { return center;
    }

    double diameter()
    {return 2*radius;
    }

    double area()
    { return Math.PI*radius*radius;
    }

    public String toString()
    { return new String("( center " + center + 
            ", radius = " + radius + "}");
    }
}

class Square extends Shape 
{ // Objects represent squares in the cartesian plane 
    private Point northWestCorner; 
    private double side; 

    Square(Point northWestCorner, double side) 
    { this.northWestCorner = northWestCorner; 
    this.side = side; 
    }

    Point center() 
    { Point c = new Point(northWestCorner); 
    c.translate(side/2, -side/2); 
    return c; 
    } 
    double diameter () 
    
    { return side*Math.sqrt(2.0); 
    } 
    
    double area () 
    { return side*side; 
    }

    public String tostring() 
    { return new String("{northWestCorner = " + northWestCorner
        + ", side = " + side + "}");
    }
}
