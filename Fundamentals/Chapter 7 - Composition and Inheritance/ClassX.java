import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class ClassX 
{ // A trivial class
    protected int m;

    public String toString()
    {
        return new String("(" + m + ")");
    }
    
}

class ClassY extends ClassX
{ // A trivial subclass of ClassX:
    private int n;

    public String toString()
    { return new String("(" + m + "," + n + ")");
    }
}

class TestClassY
{ // Test driver for ClassY:
    public static void main(String[] args) 
    {
        ClassX x = new ClassX();
        System.out.println("x = " + x);
        ClassX1 y = new ClassX1();
        System.out.println("y = " + y);    
    }

}