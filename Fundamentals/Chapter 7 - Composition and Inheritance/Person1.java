public class Person1
{ // Objects represent people
    protected Name name;
    protected char sex;
    protected String id;
    protected Person1 mother;
    protected Person1 father;
    private static final String twoBlanks = "  ";
    private static String tab = "";

    Person1(Name name, char sex)
    {
        this.name = name;
        this.sex = sex;
    }

    Person1(Name name, char sex, String id)
    {
        this.name = name;
        this.sex = sex;
        this.id = id;
    }

    Name name()
    {
        return name;
    }

    // The sex() and id() accessor methods are the same
    // as in Example 7.2

    void setId(String id)
    {
        this.id = id;
    }

    void setMother(Person1 mother)
    {
        this.mother = mother;
    }
    
    void setFather(Person1 father)
    {
        this.father = father;
    }

    public String toString()
    {
        String s = new String(name + " (" + sex + ")");
        if (id != null) s += "; id: " + id;
        s += "\n";
        if (mother != null)         // add two blanks
        {
            tab += twoBlanks;
            s += tab + "mother: " + mother;
            tab = tab.substring(2);  // remove two blanks
        }
        if (father != null)
        {
            tab += twoBlanks;          // add two blanks
            s += tab + "father: " + father;
            tab = tab.substring(2);    // removes two blanks
        }
        return s;

    }
}

class TestPerson1
{ // Test driver for the Person1 class;
    public static void main(String[] args) 
    {
        Person1 ww = new Person1(new Name("William", "Windsor"), 'M');
        Person1 cw = new Person1(new Name("Charles", "Windsor"), 'M');
        Person1 ds = new Person1(new Name("Diana", "Spenser"),'F');
        Person1 es = new Person1(new Name("Edward", "Spenser"),'M');
        Person1 ew = new Person1(new Name("Elizabeth", "Windsor"),'F');
        Person1 pm = new Person1(new Name("Philip", "Mountbatten"),'M');
        Person1 eb = new Person1(new Name("Elizabeth", "Bowes-Lyon"),'F'); 
        Person1 gw = new Person1(new Name ( "George", "Windsor"),'M') ; 
        ww. setFather (cw) ; 
        ww.setMother(ds); 
        ds.setFather (es) ; 
        cw. setMother (ew) ; 
        cw. setFather (pm) ; 
        ew. setMother (eb) ; 
        ew. setFather (gw) ; 
        System.out.println(ww); 
    } 

}


