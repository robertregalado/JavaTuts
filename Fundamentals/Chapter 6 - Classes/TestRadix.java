public class TestRadix 
{ public static void main(String[] args) 
    { int n = 59; 
        System.out.println("Decimal:\t" + Integer.toString(n)); 
        System.out.println("Binary: \t" + Integer.toBinaryString(n)); 
        System.out.println("Octa1: \t" + Integer.toOctalString(n)); 
        System.out.println("Hexadecimal:\t" + Integer.toHexString(n)); 
        System.out.println("Ternary:\t" + Integer.toString(n,3)); 
        System.out.println("Dodecimal:\t" + Integer.toString(n,12)); 
        System.out.println("Bigesimal:\t" + Integer.toString(n,20)); 
        System.out .println("Character.MIN_RADIX: = " + Character.MIN_RADIX); 
        System.out.println("Character.MAX_RADIX = " + Character.MAX_RADIX); 
        n = Integer.parseInt("d7b",16); 
        System.out.println("d7b (base 16) = " + n); 
        n = Integer.parseInt("1111", 2); 
        System.out.println("1111 (base 2) = " + n); 
        n = Integer.parseInt("53", 8); 
        System.out.println("53 (base 8) = " + n); 
    }
} 
