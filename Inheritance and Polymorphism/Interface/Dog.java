public class Dog implements Pet{
    private String name;
    private String ownername;

    public Dog(String name, String ownername){
        this.name = name;
        this.ownername = ownername;
    }

    @Override
    public void makeSound() {
        System.out.println("arfffff arffff!!");    
    }

    @Override
    public void sayName() {
        System.out.println("I'm a dog. My name is " + name);
        
    }

    @Override
    public void introduceOwner() {
        System.out.println("I am the pet of " + ownername);
        
    }
 
}
