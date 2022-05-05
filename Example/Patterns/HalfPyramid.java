public class HalfPyramid
{
public static void main(String[] args)
{
int i, j;

​/*outermost loop to represent the number of rows which is 5 in this case*/ 
for(i= 1; i<= 5; i++)
{
​
//innermost loop is to print the numbers in the specific rows 
    for (j=1; j<=i; j++)
    {
    System.out.print(j +" " );
    }
    System.out.println();
}
}
}
