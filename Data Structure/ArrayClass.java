import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[] a = {44, 77, 55, 22, 99, 33, 66};
        System.out.printf("Original array :", a);
        Arrays.sort(a);
        System.out.printf("Modified arr[] : %s",
                          Arrays.toString(a));
        int k = Arrays.binarySearch(a, 44);
        System.out.printf("Arrays.binarySearch(a, 44): %d%n", k);
        System.out.printf("a[%d]: %d%n", k, a[k]);
        k = Arrays.binarySearch(a, 45);
        System.out.printf("Arrays.binarySearch(a, 45): %d%n", k);
        int[] b = new int[8];
        //print(b);
        Arrays.fill(b, 55);
        System.out.println(b);
        System.out.println("Arrays.equals(a,b): " + Arrays.equals(a,b));
    }

        
}
    

