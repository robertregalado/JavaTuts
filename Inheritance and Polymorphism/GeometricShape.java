public class GeometricShape{
    private String name;

    GeometricShape(String name){
        this.name = name;
    }
    //holder value is 0
    public double getArea(){
        return 0;
    }

    public void fill(String color){
        System.out.println("Filling " + this.name + " with " + color);
    }
}

