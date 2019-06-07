package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;

    public InvoiceDaoTestSuite() {
    }

    @Test
    public void testItemDaoSaveWithProduct() {
        Product petrolRegularUnleaded = new Product("Petrol Regular Unleaded");
        Product dieselRegular = new Product("Diesel Regular");
        Item item1 = new Item(petrolRegularUnleaded, new BigDecimal(1.23D), 100);
        Item item2 = new Item(dieselRegular, new BigDecimal(0.99D), 20);
        petrolRegularUnleaded.getItems().add(item1);
        dieselRegular.getItems().add(item2);
        item1.setProduct(petrolRegularUnleaded);
        item2.setProduct(dieselRegular);
        this.productDao.save(petrolRegularUnleaded);
        this.productDao.save(dieselRegular);
        int item1ID = item1.getId();
        int item2ID = item2.getId();

        Assert.assertNotEquals(0L, (long)item1ID);
        Assert.assertNotEquals(0L, (long)item2ID);
        this.productDao.delete(petrolRegularUnleaded);
        this.productDao.delete(dieselRegular);
    }

    @Test
    public void testInvoiceDaoSave() {
        Product petrolRegularUnleaded = new Product("Petrol Regular Unleaded");
        Product dieselRegular = new Product("Diesel Regular");
        Item item1 = new Item(petrolRegularUnleaded, new BigDecimal(1.23D), 100);
        Item item2 = new Item(dieselRegular, new BigDecimal(0.99D), 20);
        Invoice invoice1 = new Invoice("FV2017/01");
        petrolRegularUnleaded.getItems().add(item1);
        dieselRegular.getItems().add(item2);
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        this.invoiceDao.save(invoice1);
        int invoiceID = invoice1.getId();
        String productName = ((Item)invoice1.getItems().get(0)).getProduct().getName();

        Assert.assertNotEquals(0L, (long)invoiceID);
        Assert.assertEquals("Petrol Regular Unleaded", productName);
        this.invoiceDao.delete(invoice1);
    }
}
