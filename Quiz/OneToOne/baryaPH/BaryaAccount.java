import java.util.ArrayList;

public class BaryaAccount {
    private String mobileNumber;
    private String firstName;
    private String lastName;
    public CreditLine creditLine;
    //private double amount;
    
    
    BaryaAccount(String mobileNumber, String firstName, String lastName, CreditLine creditLine) {

        this.mobileNumber = mobileNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.creditLine = creditLine;
        //amount = 0;
        
    }

    public void shop(double amount) {
        double total_amount = creditLine.getUsedCredit() + amount;
        if (total_amount <= creditLine.getCreditLimit())
            creditLine.setUsedCredit(amount);

    }

    public String displayCreditBill(String password) {
        
        String  lastFourDigits;
        if (mobileNumber.length() > 4)
        {
            lastFourDigits = mobileNumber.substring(mobileNumber.length() - 4);
        }
        else
        {
            lastFourDigits = mobileNumber;
        }
        String str2 = lastName.replaceAll("\\s", "");
        String valid_password = str2.toUpperCase() + lastFourDigits;
        if (password.equals(valid_password))
            {  double credit_bill = Math.round(creditLine.getCreditBill() * 100.0) / 100.0;
               return "Your total billed amount is " + credit_bill; 
            }
        else
            {
                return "You have entered a wrong password";  
            }
    }
}
class CreditLine {
     double creditLimit;
    private double amount;

    CreditLine(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getUsedCredit() {
        return amount;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setUsedCredit(double amount) {
        this.amount += amount;
    }

    public double getCreditBill() {
        //double total_bills = 1.05 * getUsedCredit();

        //return Math.round(total_bills * double delta) / 1000.0;
        return 1.05 * getUsedCredit();

    }

  }

class BaryaAccountTest{
    public static void main(String[] args) {
       
        CreditLine creditLine = new CreditLine(10000);
        BaryaAccount baryaAccount = new BaryaAccount("09273966538", "Peter", "Dela Diaz", creditLine);

        baryaAccount.shop(1999.99);
        baryaAccount.shop(1799.50);
        baryaAccount.shop(509.99);
        baryaAccount.shop(116.50);

        System.out.println(baryaAccount.displayCreditBill("DELADIAZ6538"));
        System.out.println(baryaAccount.creditLine.getCreditBill());
        
        /*
        CreditLine creditLine = new CreditLine(1000);
        BaryaAccount baryaAccount = new BaryaAccount("09273966111", "Marie", "Mariano", creditLine);

        baryaAccount.shop(599.50);
        baryaAccount.shop(209.99);
        baryaAccount.shop(1999.99);
        baryaAccount.shop(107.50);

        System.out.println(baryaAccount.creditLine.getCreditBill());

        */
    }
}
