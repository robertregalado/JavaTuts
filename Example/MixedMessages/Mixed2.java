public class Mixed2 {
    public static void main(String [] args) {
    A a = new A();
    B b = new B();
    C c = new C();
    A a2 = new C();
    /*
    b.m1(); // B’s m1, A’s m2, A’s m3, 
    c.m2();
    a.m3();
    */
    /*
    c.m1(); // B’s m1, A’s m2, C’s m3, 13 
    c.m2();
    c.m3();
    */
    
    /* 
    a.m1(); // A’s m1, A’s m2, C’s m3, 13
    b.m2();
    c.m3();
    */    
    
    a2.m1(); // B’s m1, A’s m2, C’s m3, 13 
    a2.m2(); 
    a2.m3();
    
    /*
    A’s m1, A’s m2, C’s m3, 6
    B’s m1, A’s m2, A’s m3, 
    A’s m1, B’s m2, A’s m3,
    B’s m1, A’s m2, C’s m3, 13 
    B’s m1, C’s m2, A’s m3,
    B’s m1, A’s m2, C’s m3, 6 
    A’s m1, A’s m2, C’s m3, 13 
    */
    }
}
