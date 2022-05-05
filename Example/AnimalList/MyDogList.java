public class MyDogList {
    private Dog [] dogs = new Dog[5]; // Use a plain old Dog array behind the scenes.
    private int nextIndex = 0; // We'll increment this each time a new Dog is added.

    public void add(Dog d) {
        if (nextIndex < dogs.length) {
            dogs[nextIndex] = d;
            System.out.println("Dog added at " + nextIndex);
            nextIndex++;
        }
    }

}