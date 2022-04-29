import java.util.zip.ZipOutputStream;

public class Alphabet
{
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(alphabet);
        System.out.println("This string contains " + alphabet.length() + " characters.");
        System.out.println("The character at index 4 is " + alphabet.charAt(4));
        System.out.println("The index of the character Z is " + alphabet.indexOf("Z"));
        System.out.println("The hashcode for this string is  " + alphabet.hashCode());

    }
}