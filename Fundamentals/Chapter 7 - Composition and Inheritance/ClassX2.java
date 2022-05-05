import java.net.SocketTimeoutException;
import java.util.function.DoubleUnaryOperator;

public class ClassX2 
{ // A trivial class:
    protected int m;
    protected int n;

    void f()
    {   System.out.println("Now in ClassX.f().");
        m = 22;
    }
    void g()
    {   System.out.println("Now in ClassX.g().");
        n = 44;
    }
    
    public String toString()
    { return new String("{ m = " + m + ", n = " + n + " }");
    }

}

class ClassY2 extends ClassX2
{
    // A trivial subclass of class Overriding:
    private double n;

    void g()
    {
        System.out.println("Now in ClassY.g().");
        n = 3.1415926535897932;
    }

    public String toString()
    {
        return new String("( m = " + m + ", n = " + n + " )");
    }
}

class TestClassY2{
    // Test driver for ClassY:
    public static void main(String[] args) {
        ClassX2 x = new ClassX2();
        x.f();
        x.g();
        System.out.println("x = " + x);
        ClassY2 y = new ClassY2();
        y.f();
        y.g();
        System.out.println("y = " + y); 
    }
}
