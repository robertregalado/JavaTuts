import java.io.FileReader;

class Name
{
    private String first; //e.g "Robert"
    private String middle; // e.g, "Judal"
    private String last; // e.g, "Regalado"

    Name() // default constructor
    {

    }
    Name(String first, String last)
    {
        this.first = first;
        this.last = last;
    }
    Name(String first, String middle, String last)
    {
        this(first,last);
        this.middle = middle;
    }

    String first()
    {
        return first;
    }
    
    String middle()
    {
        return middle;
    }
    
    String last()
    {
        return last;
    }

    void setFirst(String first)
    {
        this.first = first;
    }
    
    void setMiddle(String middle)
    {
        this.middle = middle;
    }
    
    void setLast(String last)
    {
        this.last = last;
    }

    public String toString()
    {
        String s = new String();
        if (first != null) s += first + " ";
        if (middle != null) s += middle + " ";
        if (last != null) s += last + " ";
        return s.trim();
    }
}

class TestName
    {
        // Test driver for Name class
    public static void main(String[] args) 
    {
        Name tr = new Name("Robert", "Regalado");
        Name nr = new Name("Nida", "Gagabo-an", "Regalado");
        System.out.println(nr + " won the 1962 Nobel in Physiology.");
        System.out.println("His first name was " + nr.first() + ".");
        System.out.println(tr + " won the 1906 Nobel Peace Prize.");
        System.out.println("His middle name was " + tr.middle() + ".");


    }
}