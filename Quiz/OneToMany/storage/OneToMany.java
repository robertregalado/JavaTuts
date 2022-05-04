import java.util.ArrayList;
import java.util.List;

class Subject {
    private String subjectName;
    private String stubCode;
    private int units;

    public Subject(String subjectName, String stubCode, int units){
        this.subjectName = subjectName;
        this.stubCode = stubCode;
        this.units = units;
    }
    // Getters
    public String getSubjectName(){
        return subjectName;
    }

    public String getStubCode(){
        return stubCode;
    }
    public int getUnits(){
        return units;
    }    
}

class Student {
    private String name;
    private List<Subject> subjects = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }
    // Getters
    public String getName(){
        return name;
    }

    public void getAddSubject(Subject subject){
        subjects.add(subject);
    }

    public List<Subject> getSubjects(){
        return subjects;
    }
}

class Main {
    public static void main(String[] args) {
        Student student = new Student("Robert Regalado");

        // student.getAddSubject(new Subject("Algebra", "MATH101", 5));
        // student.getAddSubject(new Subject("Trigonemetry", "MATH102", 3));
        // student.getAddSubject(new Subject("Differential Calculus", "MATH201", 5));
        // student.getAddSubject(new Subject("Integral Calculus", "MATH202", 5));
        // student.getAddSubject(new Subject("Probability and Statistics", "MATH203", 3));

        if (student.getSubjects().isEmpty()){
            System.out.println(student.getName() + " has not enrolled to any subjects:");
        } else {
            for (Subject subject : student.getSubjects()){
                System.out.println(subject.getSubjectName() + " - " + subject.getStubCode() + " (" + subject.getUnits() +")");
            }
        }
    }
}