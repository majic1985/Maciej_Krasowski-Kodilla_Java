package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;

public final class ProductTypes {
    public static final ArrayList<String> productTypes = new ArrayList();

    public ProductTypes() {
        productTypes.add("Gry");
        productTypes.add("Kapcie");
        productTypes.add("Szczoteczki do zebow");
        productTypes.add("inne");
    }

    public final boolean validateProductType(String productType) {
        return productTypes.stream().anyMatch((n) -> {
            return n.equals(productType);
        });
    }

    public final ArrayList<String> getProductTypes() {
        return productTypes;
    }
}
