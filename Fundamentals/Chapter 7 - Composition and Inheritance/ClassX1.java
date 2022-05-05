public class ClassX1 
{ // A trivial class:
    private int m;

    public String toString()
    {
        return new String("(" + m + ")");
    }
    
}

class ClassY1 extends ClassX1
{// A trivial subclass of ClassX
    private int n;

    public String toString()
    {
        return new String("(" + m + "," + n + ")"); // ERROR: no field m
    }

}

class TestClassY1
{ // Test driver for ClassY:
    public static void main(String[] args) 
    {
        ClassX1 x1 = new ClassX1();
        System.out.println("x1 + " + x1);
        ClassY1 y1 = new ClassY1();
        System.out.println("y1 + " + y1);
    }

}
