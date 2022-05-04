import java.util.ArrayList;

public class Person {

    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void growOlder() {
        this.age = this.age + 1;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightDivByHundred = this.height / 100.0;
        return this.weight / (heightDivByHundred * heightDivByHundred);
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years " + this.height + " cm tall " + this.weight + " kgs.";
    }
}

class Main{
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        Person robert = new Person("Robert");
        persons.add(robert);
        persons.add(new Person("Nida"));
        persons.add(new Person("Michaela"));
        persons.add(new Person("Christopher"));
        persons.add(new Person("Brian"));

        robert.setHeight(173);
        robert.setWeight(165);
        robert.setAge(43);

        for (Person person:persons){
            System.out.println(person);
        }
        


    }
}
