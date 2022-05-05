import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloRobert{
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        System.out.println("Enter your name: ");
        String name = input.readLine();
        System.out.println("Enter your age: ");
        String age = input.readLine();
        System.out.println("Hello, " + name + "!" );
        System.out.println("I am " + age + " years old!" );
        //age = 0;
    }
}