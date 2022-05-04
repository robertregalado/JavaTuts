package com.merchandizer;

public class Main {
    public static void main(String[] args) {

        StockDetails stockDetails = new StockDetails("Huawei", "Gadget", 140, 12000);
        Stock stock = new Stock("H206", "Y7p", stockDetails);
        System.out.println(stock.getTotalPrice());
        System.out.println(stock.toString());
        stock.addStock(50);

        System.out.println("After adding: ");
        System.out.println(stockDetails.getQuantity());

        System.out.println("After subtracting: ");
        stock.subtractStock(190);

        stock.addStock(50);
        System.out.println("After adding: ");
        System.out.println(stockDetails.getQuantity());

    }
}
