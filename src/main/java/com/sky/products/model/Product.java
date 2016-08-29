package com.sky.products.model;

/**
 * <p>
 *      DTO object representing a Product.
 * </p>
 * @author Lee Grubb
 * Date: 29/08/2016
 */
public class Product {

    private String productName;
    private String category;
    private String locationId;

    public Product(String productName, String category, String locationId){
        this.productName = productName;
        this.category = category;
        this.locationId = locationId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public String getLocationId() {
        return locationId;
    }
}
