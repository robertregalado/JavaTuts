import java.security.ProtectionDomain;

import javax.swing.event.ChangeEvent;

public class Person 
{ // Objects represent people

    protected Name name;
    protected char sex;  // 'M' or 'F'
    protected String id; // e.g., Social Security Number
    
    Person(Name name, char sex)
    {
        this.name = name;
        this.sex = sex;
    }

    Person(Name name, char sex, String id)
    {
        this.name = name;
        this.sex = sex;
        this.id = id;
    }

    Name name()
    {
        return name;
    }

    char sex()
    {
        return sex;  
    }
    
    String id()
    {
        return id;  
    }

    void setId(String id)
    {
        this.id = id;
    }

    public String toString()
    {
        String s = new String(name + " (sex: " + sex);
        if (id != null) s += "; id: " + id;
        s += " ) ";
        return s;
    }
}
// The test driver
class TestPerson 
{ // Test driver for the Person class: 
    public static void main(String[] args) 
    {   Name bobsName = new Name("Robert","Lee"); 
        Person bob = new Person(bobsName,'M'); 
        System.out.println("bob: " + bob); 
        bob.name.setMiddle("Edward") ; 
        System.out.println("bob:" + bob); 
        Person ann = new Person(new Name("Ann", "Baker"), 'F'); 
        System.out.println("ann:" + ann); 
        ann.setId ("053011736"); 
        System.out.println("ann:" + ann); 
    }
}
