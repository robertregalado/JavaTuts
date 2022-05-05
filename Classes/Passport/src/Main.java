import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
         // Classes

        Passport ukPassport = new Passport(
                "12345",
                "UK",
                "Robert",
                LocalDate.of(2030,10,10));

        Passport usaPassport = new Passport(
                "12345",
                "UK",
                "Nida",
                LocalDate.of(2030,10,10));

        Passport philippinePassport = new Passport(
            "12345",
            "UK",
            "Michaela",
            LocalDate.of(2030,10,10));

        System.out.println("List of passports:");
        System.out.println("======================");
        System.out.println("Name: " + ukPassport.name);
        System.out.println("Passport Number: " + ukPassport.passportNumber);
        System.out.println("Country: " + ukPassport.country);
        System.out.println("Date of Birth: " + ukPassport.dob);
        System.out.println("++++++++++++++++++++++");

        System.out.println("Name: " + usaPassport.name);
        System.out.println("Passport Number: " + usaPassport.passportNumber);
        System.out.println("Country: " + usaPassport.country);
        System.out.println("Date of Birth: " + usaPassport.dob);
        System.out.println("++++++++++++++++++++++");

        System.out.println("Name: " + philippinePassport.name);
        System.out.println("Passport Number: " + philippinePassport.passportNumber);
        System.out.println("Country: " + philippinePassport.country);
        System.out.println("Date of Birth: " + philippinePassport.dob);
        System.out.println("++++++++++++++++++++++");

    }

    static class Passport {
        String passportNumber;
        String country;
        String name;

        LocalDate dob;

        Passport(String passportNumber, String country, String name, LocalDate dob){
            this.passportNumber = passportNumber;
            this.country = country;
            this.name = name;
            this.dob = dob;

        }
    }
}