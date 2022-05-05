public class Square extends GeometricShape{
    private double sidelength;

    public Square(double sidelength, String name){
        super(name);
        this.sidelength = sidelength;
    }

    @Override
    public double getArea(){
        return Math.pow(sidelength, 2);
    }
    
}
