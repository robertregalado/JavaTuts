    
public class Bar {
    public static final double BAR_SIGN;
    
    // this code runs as soon as the class
    // is loaded, before any static method
    // is called and even before any static
    // variable can be used
    static {
        BAR_SIGN = (double) Math.random();
    }
}
