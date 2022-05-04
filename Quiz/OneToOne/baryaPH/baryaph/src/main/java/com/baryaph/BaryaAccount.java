package com.baryaph;
/**
 * Barya PH is a mobile wallet app that provides its user one personal credit line. 
 * This app can be used to pay bills or shop at any accredited partners.
 * Create a class Barya Account which accepts mobile number first name, last name, 
 * and a credit line which accepts the credit limit.
 * Your credit line will have a function which gives your credit bill having a 5% interest.

Your Barya Account will have functions:
a. "shop" which lets you buy stuff, provided that you will not exceed your given credit limit.

b. "display bill" which accepts a password, which is your last name(in uppercase, 
remove spaces if there's any) + the last four digits of your mobile number. 
Which displays your credit bill, if the given password is correct you should display 
“Your total billed amount is ”, otherwise display “You have entered a wrong password”
 */

import java.util.*;

public class BaryaAccount {
    private String mobileNumber;
    private String firstName;
    private String lastName;
    public CreditLine creditLine;

    BaryaAccount(String mobileNumber, String firstName, String lastName, CreditLine creditLine) {

        this.mobileNumber = mobileNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.creditLine = creditLine;
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
            {
               double credit_bill = Math.round(creditLine.getCreditBill() * 100.0) / 100.0;
               return "Your total billed amount is " + credit_bill; 
            }
        else
            {
                return "You have entered a wrong password";  
            }
    }
}
class CreditLine {
    private double creditLimit;
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

        return 1.05 * getUsedCredit();
    }

  }
