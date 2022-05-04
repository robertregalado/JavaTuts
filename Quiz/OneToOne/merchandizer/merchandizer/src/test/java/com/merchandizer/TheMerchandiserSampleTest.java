package com.merchandizer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;

public class TheMerchandiserSampleTest {
    String expected = "";

    @BeforeEach
    public void ___OO___SE___CS___SL___setUp() {
        System.out.println("Before test");

    }

    @AfterEach
    public void ___OO___SE___CS___SL___tearDown() {
        System.out.println("After test");
    }

    @Test
    public void ___OO___SE___CS___SL___stock1() {
        StockDetails stockDetails = new StockDetails("Huawei", "Gadget", 140, 12000);
        Stock stock = new Stock("H206", "Y7p", stockDetails);
        expected = "Stock Code: H206\nStock Name: Y7p"
                + "\nOn Stock: 06-10-2020\nCompany Name: Huawei\nProduct Type: Gadget"
                + "\nQuantity: 140\nPrice per Piece: 12000.0\nTotal Price: 1680000.0"
                + "\nTotal Price (VAT 5%): 1764000.0";

        assertEquals(1680000.0, stock.getTotalPrice(), 0.0);
        assertEquals(1764000.0, stock.getTotalPriceWithVat(), 0.0);
        assertEquals(expected, stock.toString());
    }
    
    @Test
    public void ___OO___SE___CS___SL___add_stock1() {
        StockDetails stockDetails = new StockDetails("Huawei", "Gadget", 140, 12000);
        Stock stock = new Stock("H206", "Y7p", stockDetails);
        expected = "Stock Code: H206\nStock Name: Y7p"
                + "\nOn Stock: 06-10-2020\nCompany Name: Huawei\nProduct Type: Gadget"
                + "\nQuantity: 140\nPrice per Piece: 12000.0\nTotal Price: 1680000.0"
                + "\nTotal Price (VAT 5%): 1764000.0";

        assertEquals(140, stock.getStockDetails().getQuantity());
        assertEquals(1680000.0, stock.getTotalPrice(), 0.0);
        assertEquals(1764000.0, stock.getTotalPriceWithVat(), 0.0);
        assertEquals(expected, stock.toString());

        stock.addStock(50);
        expected = "Stock Code: H206\nStock Name: Y7p"
                + "\nOn Stock: 06-10-2020\nCompany Name: Huawei\nProduct Type: Gadget"
                + "\nQuantity: 190\nPrice per Piece: 12000.0\nTotal Price: 2280000.0"
                + "\nTotal Price (VAT 5%): 2394000.0";

        assertEquals(190, stock.getStockDetails().getQuantity());
        assertEquals(2280000.0, stock.getTotalPrice(), 0.0);
        assertEquals(2394000.0, stock.getTotalPriceWithVat(), 0.0);
        assertEquals(expected, stock.toString());
    }

    @Test
    public void ___OO___SE___CS___SL___add_subtract_stock1() {
        StockDetails stockDetails = new StockDetails("Huawei", "Gadget", 140, 12000);
        Stock stock = new Stock("H206", "Y7p", stockDetails);
        expected = "Stock Code: H206\nStock Name: Y7p"
                + "\nOn Stock: 06-10-2020\nCompany Name: Huawei\nProduct Type: Gadget"
                + "\nQuantity: 140\nPrice per Piece: 12000.0\nTotal Price: 1680000.0"
                + "\nTotal Price (VAT 5%): 1764000.0";

        assertEquals(140, stock.getStockDetails().getQuantity());
        assertEquals(1680000.0, stock.getTotalPrice(), 0.0);
        assertEquals(1764000.0, stock.getTotalPriceWithVat(), 0.0);
        assertEquals(expected, stock.toString());
        
        stock.addStock(50);
        expected = "Stock Code: H206\nStock Name: Y7p"
                + "\nOn Stock: 06-10-2020\nCompany Name: Huawei\nProduct Type: Gadget"
                + "\nQuantity: 190\nPrice per Piece: 12000.0\nTotal Price: 2280000.0"
                + "\nTotal Price (VAT 5%): 2394000.0";

        assertEquals(190, stock.getStockDetails().getQuantity());
        assertEquals(2280000.0, stock.getTotalPrice(), 0.0);
        assertEquals(2394000.0, stock.getTotalPriceWithVat(), 0.0);
        assertEquals(expected, stock.toString());

        stock.subtractStock(180);
        expected = "Stock Code: H206\nStock Name: Y7p"
                + "\nOn Stock: 06-10-2020\nCompany Name: Huawei\nProduct Type: Gadget"
                + "\nQuantity: 10\nPrice per Piece: 12000.0\nTotal Price: 120000.0"
                + "\nTotal Price (VAT 5%): 126000.0";

        assertEquals(10, stock.getStockDetails().getQuantity());
        assertEquals(120000.0, stock.getTotalPrice(), 0.0);
        assertEquals(126000.0, stock.getTotalPriceWithVat(), 0.0);
        assertEquals(expected, stock.toString());
    }
}