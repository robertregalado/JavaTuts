import java.util.Random;

public class Example0308
{
    public static void main(String[] args) {
        Random random = new Random();
        float x = random.nextFloat();
        System.out.println("x = " + x);
        float y = random.nextFloat();
        System.out.println("y = " + y);
        float min = (x < y ? x : y );
        float max = (x > y ? x : y );
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}