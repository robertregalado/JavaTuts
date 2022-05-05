// Sample of Abstract class and method implementations

abstract public class GeometricShape{
    private String name;

    GeometricShape(String name){
        this.name = name;
    }
    //abstract method cannot be instantiated
    abstract public double getArea();

    public void fill(String color){
        System.out.println("Filling " + this.name + " with " + color);
    }
}

