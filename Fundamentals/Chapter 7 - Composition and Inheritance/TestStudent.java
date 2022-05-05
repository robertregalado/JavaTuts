class Student extends Person
{// Objects represent students
    protected int credits;   // credit hours
    protected double gpa;    // grade-point average

    Student(Name name, char sex, int credits, double gpa)
    {   super(name,sex);
        this.credits = credits;
        this.gpa = gpa;   
    }

    int credits()
    {
        return credits;
    }

    double gpa()
    { return gpa;
    }

    public String toString()
    {
        String s;
        s = new String(super.toString());
        s += "\n\tcredits: " + credits;
        s += "\n\tgpa: " + gpa;
        return s;
    }
}

class TestStudent
{ public static void main(String[] args) {
    Name annsName = new Name("Ann", "Baker");
    Student ann = new Student(annsName, 'F', 16, 3.5);
    System.out.println("ann: " + ann);
}}





public class TestStudent {
    
}
