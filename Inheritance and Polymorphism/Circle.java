public class Circle extends GeometricShape{
    private double radius;

    public Circle(double radius, String name){
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    
}
