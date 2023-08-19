package com.kodilla.stream.invoice.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleInvoiceTestSuite {

    @Test
    void testGetValueToPay(){
        //Given
        SimpleInvoice simpleInvoice = new SimpleInvoice();

        //When
        simpleInvoice.addItem(new SimpleItem(new SimpleProduct("Produkt 1", 17.28), 2));
        simpleInvoice.addItem(new SimpleItem(new SimpleProduct("Produkt 2", 11.99), 3.5));
        simpleInvoice.addItem(new SimpleItem(new SimpleProduct("Produkt 3", 6.49), 5));

        //Then
        assertEquals(108.975, simpleInvoice.getValiuToPay(), 0.001);
    }

}
