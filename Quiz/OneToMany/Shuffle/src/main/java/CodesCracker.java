import java.util.Scanner;

public class CodesCracker {
    public static void main(String[] args)
    {
        int i, j;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of first array: ");
        int x = scan.nextInt();
        int[] a = new int[x];
        System.out.print("Enter " +x+ " elements for first array: ");
        for(i=0; i<x; i++)
            a[i] = scan.nextInt();

        System.out.print("\nEnter the size of second array: ");
        int y = scan.nextInt();
        int[] b = new int[y];
        System.out.print("Enter " +y+ " elements for second array: ");
        for(i=0; i<y; i++)
            b[i] = scan.nextInt();

        // merging both the entered arrays into the third array
        int[] merge = new int[x+y];
        for(i=0; i<x; i++)
            merge[i] = a[i];
        for(j=0; j<y; j++)
            merge[i++] = b[j];

        // sorting the merged array
        int k = i;
        for(i=0; i<(k-1); i++)
        {
            for(j=0; j<(k-1); j++)
            {
                if(merge[j]>merge[j+1])
                {
                    int temp = merge[j];
                    merge[j] = merge[j+1];
                    merge[j+1] = temp;
                }
            }
        }

        // printing the sorted merged array
        System.out.println("\nThe merged array is: ");
        for(i=0; i<k; i++)
            System.out.print(merge[i]+ " ");
    }
}
