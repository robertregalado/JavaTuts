import java.util.Scanner;

public class ArrayDefs {
    public static void main(String[] args) {
            float x[];
            x = new float[100];
            for(int i = 0; i < x.length; i++){
                if(i%2==0){
                    x[i] = i;
                    System.out.print(x[i]+" ");
                }else{
                    continue;
                }

            }
            args = new String[10];
       
            boolean[] isPrime = new boolean[1000];
            int fib[] = {0, 1, 1, 2, 3, 5, 8, 13};
            //fib[0] = 100;
            short[][][] b = new short[4][10][5];
            double a[][] = {{1.1,2.2}, {3.3,4.4}, null, {5.5,6.6}, null};
            a[4] = new double[66];
            a[4][65] = 3.14;
            a[4][60] = 5.15;
            Object[] objects = {x, args, isPrime, fib, b, a};
            System.out.println(fib[0]);
            System.out.println(x[1]);
            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println(args[2]);
              System.out.println(a[4][60]);
              System.out.println(a[4].length);
        }
    
}
