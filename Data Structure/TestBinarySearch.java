import java.lang.reflect.Array;
import java.util.Arrays;

public class TestBinarySearch {
    
        public static void main(String[] args) {
            int[] a = {44, 77, 55, 22, 99, 88, 33, 66};
            System.out.println("===========================");
            for(int i = 0; i < a.length; i++){
                System.out.print(a[i] + " ");
            }
            
            Arrays.sort(a);
            System.out.println("");
            for(int i = 0; i < a.length; i++){
                System.out.print(a[i]+ " ");
            }
            
            //System.out.println(a);
            int k = Arrays.binarySearch(a, 44);
             System.out.println("");
            System.out.printf("Arrays.binarySearch(a, 44): %d%n", k);
            System.out.printf("a[%d]: %d%n", k, a[k]);
            k = Arrays.binarySearch(a, 45);
            System.out.printf("Arrays.binarySearch(a, 45): %d%n", k);
            int[] b = new int[8];
            System.out.println(b);
            Arrays.fill(b, 55);
            System.out.println(b);
            System.out.println("Arrays.equals(a,b): " + Arrays.equals(a,b));
            
        }
   
}