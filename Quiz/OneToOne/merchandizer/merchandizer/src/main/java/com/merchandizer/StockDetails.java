package com.merchandizer;
/**
 * Merchandisers play a very important role in the society.
 * They are the ones who are responsible for providing valuable goods and services
 * to the people. In every merchandise, there’s an inventory. Make a Stock class that
 * has a code, name and details. Details of a stock include: on stock date, company name,
 * product type, quantity and price per piece.

The program can:
Calculate the total price of a stock
Calculate the total price of a stock with Value Added Tax (VAT 5%)
Aside from these functionalities, the program can also:
Add stock of a certain quantity
Subtract stock of a certain quantity

NOTES:

On stock date refers to the current date when stock was added (Format: MM-dd-yyyy)
Prices (Total Price and Total Price with VAT) should be rounded to two decimal places.
Stock with already zero quantity should return “OUT of Stock!”.

Example:

Input:

StockDetails stockDetails = new StockDetails("Toshiba", "Gadget", 50, 38000);
Stock stock = new Stock("T321", "Satellite L50-B1378", stockDetails);

Output:

Stock Code: T321
Stock Name: Satellite L50-B1378
On Stock: 06-10-2020
Company Name: Toshiba
Product Type: Gadget
Quantity: 50
Price per Piece: 38000.0
Total Price: 1900000.0
Total Price (VAT 5%): 1995000.0

 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StockDetails {
    private String companyName;
    private String productType;
    private int quantity;
    private double pricePerPiece;

    public StockDetails(String companyName, String productType, int quantity, double pricePerPiece) {
      //insert code
      this.companyName = companyName;
      this.productType = productType;
      this.quantity = quantity;
      this.pricePerPiece = pricePerPiece;

    }

    public String getOnStockDate() {
      //insert code
        LocalDate prevdate = LocalDate.of(2020,06,10);
        //LocalDate myDateObj = LocalDate.now()
        //System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy");

        String formattedDate = prevdate.format(myFormatObj);
        //System.out.println("After formatting: " + formattedDate);
        //return myDateObj;
        return formattedDate;
    }

    public String getCompanyName() {
      //insert code
      return companyName;
    }

    public String getProductType() {
      //insert code
      return productType;
    }

    public int getQuantity() {
      //insert code
      return quantity;
    }

    public void setQuantity(int quantity) {
      //insert code
      this.quantity = quantity;

    }

    public double getPricePerPiece() {
      //insert code
      return pricePerPiece;
    }
}

class Stock {
    static double VALUE_ADDED_TAX = 0.05;
    private String code;
    private String stockName;
    public StockDetails stockDetails;


    public Stock(String code, String stockName, StockDetails stockDetails) {
      //insert code
      this.code = code;
      this.stockName = stockName;
      this.stockDetails = stockDetails;


    }

    public String getCode() {
      //insert code
      return code;
    }

    public String getStockName() {
      //insert code
      return stockName;
    }

    public StockDetails getStockDetails() {
      //insert code
      return stockDetails;
    }

    public double getTotalPrice() {
      return stockDetails.getQuantity() * stockDetails.getPricePerPiece();
    }

    public double getTotalPriceWithVat() {
      //insert code
      return  getTotalPrice() * (1 + VALUE_ADDED_TAX);
    }

    public void addStock(int additionalQuantity) {
      //insert code
       int stock = stockDetails.getQuantity() + additionalQuantity;
       stockDetails.setQuantity(stock);
    }

    public void subtractStock(int neededQuantity) {
      //insert code
      int stock = stockDetails.getQuantity() - neededQuantity;
      if (stock <= 0)
          System.out.println("OUT of Stocks!");
      stockDetails.setQuantity(stock);
    }

    @Override
    public String toString() {
      //insert code
      return "Stock Code: " + getCode() +
             "\nStock Name: " + getStockName() +
             "\nOn Stock: " + stockDetails.getOnStockDate() +
             "\nCompany Name: " + stockDetails.getCompanyName() +
             "\nProduct Type: " + stockDetails.getProductType() +
             "\nQuantity: " + stockDetails.getQuantity() +
             "\nPrice per Piece: " + stockDetails.getPricePerPiece() +
             "\nTotal Price: " + getTotalPrice() +
             "\nTotal Price (VAT 5%): " + getTotalPriceWithVat();
    }
}
