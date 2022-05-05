public class Main {
    public static void main(String[] args) {
        // Classes and Objects
        Lens lensOne = new Lens("Sony","75mm",true);
        Lens lensTwo = new Lens("Sony","30mm",true);
        Lens lensThree = new Lens("LG","24mm",true);
        Lens lensFour = new Lens("Canon","24-60mm",false);
        System.out.println("Lens 1");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);
        System.out.println("====================================");
        System.out.println("Lens 1");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensTwo.isPrime);
        System.out.println("===================================");
        System.out.println("Lens 1");
        System.out.println(lensThree.brand);
        System.out.println(lensThree.focalLength);
        System.out.println(lensThree.isPrime);
        System.out.println("===================================");
        System.out.println("Lens 1");
        System.out.println(lensFour.brand);
        System.out.println(lensFour.focalLength);
        System.out.println(lensFour.isPrime);
    }

    static class Lens{
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand, String focalLength, boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }



}