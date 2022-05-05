import java.util.Scanner;

class Skanner{
  public static void main(String[] args) {
    Scanner myFirstName = new Scanner(System.in);
    System.out.println("Enter Firstname: ");
    String firstName = myFirstName.nextLine();

    Scanner myLastName = new Scanner(System.in);
    System.out.println("Enter Lastname: ");
    String lastName = myLastName.nextLine();
    System.out.println("Full Name is: " + firstName + " " + lastName);
  }
}