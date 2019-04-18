package com.kodilla.good.patterns.food2door;

public class SuppliersRetriever {
    public SuppliersList retrieve() {

        Supplier supplier0 = new Supplier(
                "ExtraFoodShop",
                new LocalAddress("34 Pacific Way",
                        "London",
                        "SE4 2DG",
                        "United Kingdom"),
                657654200);

        Supplier supplier1 = new Supplier(
                "HealthyShop",
                new LocalAddress("4 Gordon St",
                        "Birmingham",
                        "BE2 8HG",
                        "United Kingdom"),
                657652000);

        Supplier supplier2 = new Supplier(
                "GlutenFreeShop",
                new LocalAddress("45 Martin Pl",
                        "Glasgow",
                        "CE45 6XZ",
                        "United Kingdom"),
                651002000);

        SuppliersList suppliersList = new SuppliersList();
        suppliersList.addSupplier(supplier0);
        suppliersList.addSupplier(supplier1);
        suppliersList.addSupplier(supplier2);

        return suppliersList;
    }
}
