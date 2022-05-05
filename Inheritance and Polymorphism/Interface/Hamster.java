public class Hamster implements Pet {
    private String name;
    private String ownername;

    public Hamster(String name, String ownername){
        this.name = name;
        this.ownername = ownername;
    }

    @Override
    public void makeSound() {
        System.out.println("Ikkkk Ikkkkk!!!!!!!!");    
    }

    @Override
    public void sayName() {
        System.out.println("I'm a hamster. My name is " + name);
        
    }

    @Override
    public void introduceOwner() {
        System.out.println("I am the pet of " + ownername);
        
        
    }

    
    
}
