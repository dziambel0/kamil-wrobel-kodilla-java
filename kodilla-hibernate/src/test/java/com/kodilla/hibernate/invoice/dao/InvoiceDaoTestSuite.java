package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
private InvoiceDao invoiceDao;

//    @Test
//    void testInvoiceDaoSave(){
//        //Given
//        Product szczoteczka = new Product("Szczoteczka");
//        Product pasta = new Product("Pasta");
//        Product krem = new Product("Krem");
//        Item item1 = new Item(szczoteczka, new BigDecimal(12), 3);
//        Item item2 = new Item(pasta, new BigDecimal(8), 1);
//        Item item3 = new Item(krem, new BigDecimal(34), 1);
//        List<Item> items = new ArrayList<>();
//        items.add(item1);
//        items.add(item2);
//        items.add(item3);
//        Invoice invoice = new Invoice("0001", items);
//        item1.setInvoice(invoice);
//        item2.setInvoice(invoice);
//        item3.setInvoice(invoice);
//
//        //When
//        invoiceDao.save(invoice);
//        int id = invoice.getId();
//
//        //Then
//        assertNotEquals(0, id);
//
//        //CleanUp
//        invoiceDao.deleteById(id);
//    }
}
