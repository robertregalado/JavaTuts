/**
 * StudentAddress
 */
class StudentAddress {
    private String city;
    private String country;

    public StudentAddress(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;    
    }

    public String getCountry(){
        return country;
    }
}

class Student {
    private String name;
    private StudentAddress address;

    public Student(String name, StudentAddress address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public StudentAddress getAddress(){
        return address;
    }
}

class Main{
    public static void main(String[] args) {
    //StudentAddress address = new StudentAddress("Imus", "Philippines");
    StudentAddress address = null;

    Student student = new Student("Robert Regalado", address);

    if (student.getAddress() != null) {
        System.out.println("Student " + student.getName() + " is living in " + student.getAddress().getCity() + ", " + student.getAddress().getCountry()+".");

    } else {
        System.out.println("It seems that " + student.getName() + " doesn't have an address.");
    } 
    }
}
