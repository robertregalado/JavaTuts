public class GeometricShapeTest {
 public static void main(String[] args) {
     Circle circle = new Circle(2, "Circle");
     Square square = new Square(2, "Square");
     Triangle triangle = new Triangle(4, 4, "Triangle");

     System.out.println("Circle Area: " + circle.getArea());
     circle.fill("black");
     System.out.println("Sqaure Area: " + square.getArea());
     square.fill("blue");
     System.out.println("Triangle Area: " + triangle.getArea());
     triangle.fill("red");

 }    
}
