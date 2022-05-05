public class TestBoats {
    public static void main(String[] args){

    Boat b1 = new Boat();
    Sailboat b2 = new Sailboat();
    Rowboat b3 = new Rowboat();
    b2.setLength(32);
    b1.move();
    b3.setLength(64);
    b3.move();
    b1.setLength(128);
    b1.move();
    b2.move();
    b3.rowTheBoat();

    System.out.println(b2.getLength());
    System.out.println(b1.getLength());
    System.out.println(b3.getLength());
    } 
}
