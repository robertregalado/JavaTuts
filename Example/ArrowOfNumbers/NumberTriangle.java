public class NumberTriangle
{
public static void main(String[] args)
{
int i, j;
int rows =7;

for (i=1; i<= rows; i++)
{
for (j=1; j<=i; j++)
{
System.out.print(j + " ");
}
System.out.println();
}
for (i=rows-1; i>=1; i--)
{
for (j=1; j<=i; j++)
{
System.out.print(j + " ");
}
System.out.println();
}
}
}