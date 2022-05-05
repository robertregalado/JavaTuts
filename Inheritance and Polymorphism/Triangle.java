import javax.sql.rowset.BaseRowSet;

public class Triangle extends GeometricShape{
    private double base;
    private double height;

    public Triangle(double base, double height, String name){
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea(){
        return 0.5 * (base * height);
    }
    
}
