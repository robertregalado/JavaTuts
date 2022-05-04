package com.baryaph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaryaPHSampleTest {

    @Test
    public void ___00P___get_credit_bill() {
        CreditLine creditLine = new CreditLine(10000);
        BaryaAccount baryaAccount = new BaryaAccount("09273966538", "Peter", "Diaz", creditLine);

        baryaAccount.shop(1999.99);
        baryaAccount.shop(1799.50);
        baryaAccount.shop(509.99);
        baryaAccount.shop(116.50);

        assertEquals(4647.279, baryaAccount.creditLine.getCreditBill(), .0001);
    }

    @Test
    public void ___00P___get_credit_bill_with_insufficient_balance() {
        CreditLine creditLine = new CreditLine(1000);
        BaryaAccount baryaAccount = new BaryaAccount("09273966111", "Marie", "Mariano", creditLine);

        baryaAccount.shop(599.50);
        baryaAccount.shop(209.99);
        baryaAccount.shop(1999.99);
        baryaAccount.shop(107.50);

        assertEquals(962.8395, baryaAccount.creditLine.getCreditBill(), .00001);
    }

    @Test
    public void ___00P___get_display_bill() {
        CreditLine creditLine = new CreditLine(5000);
        BaryaAccount baryaAccount = new BaryaAccount("09273917888", "Maria", "Ponce", creditLine);

        baryaAccount.shop(1999.99);

        assertEquals("Your total billed amount is 2099.99", baryaAccount.displayCreditBill("PONCE7888"));
    }

   
    @Test
    public void ___00P___get_display_bill_incorrect_password() {
        CreditLine creditLine = new CreditLine(5000);
        BaryaAccount baryaAccount = new BaryaAccount("09097396727", "Ferdie", "Fernandez", creditLine);

        baryaAccount.shop(1999.99);

        assertEquals("You have entered a wrong password", baryaAccount.displayCreditBill("FERNAND7177"));
    }
}
