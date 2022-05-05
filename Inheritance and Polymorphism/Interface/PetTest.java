public class PetTest {
   public static void main(String[] args) {
       Hamster hamster = new Hamster("Hamsy", "Sach");
       Dog dog = new Dog("Browny", "Rafael");

       hamster.makeSound();
       hamster.sayName();
       hamster.introduceOwner();

       System.out.println("");
       dog.makeSound();
       dog.sayName();
       dog.introduceOwner();


   } 
}
