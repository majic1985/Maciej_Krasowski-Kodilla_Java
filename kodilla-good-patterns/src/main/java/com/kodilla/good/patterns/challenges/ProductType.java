package com.kodilla.good.patterns.challenges;

public class ProductType {
    public String productType;

    public ProductType(String productType) {
        ProductTypes productTypes = new ProductTypes();
        if (productTypes.validateProductType(productType)) {
            this.productType = productType;
        } else {
            System.out.println("incorrect product type, try again.");
        }

    }

    public String getProductType() {
        return this.productType;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            ProductType that = (ProductType)o;
            return this.productType != null ? this.productType.equals(that.productType) : that.productType == null;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.productType != null ? this.productType.hashCode() : 0;
    }
}

