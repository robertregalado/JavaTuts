public class Dog {
    String name;
    public static void main(String[] args) {
        // make a Dog object and access it
        Dog dog1 = new Dog();
        dog1.name = "Bert";
        //dog1.bark();

        // now make a Dog array
        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        
        // now access the Dogs using the array
        // references
        myDogs[0].name = "Fred";
        myDogs[1].name = "Cattie";
        
        // now loop through the array
        // and tell all dogs to bark
        int x = 0;
        while(x < myDogs.length){
            myDogs[x].bark();
            myDogs[x].eat();
            myDogs[x].chaseCat();    
            x = x + 1;
        }
     
    }
    public void bark() {
        System.out.println(name + " says Ruff!");
        
    }
    public void eat() {
        System.out.println(name + " eat yummy food.");
        
    }
    public void chaseCat(){
        System.out.println(name + " catch the cat.");
    }
}
