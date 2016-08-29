package com.sky.products.model;

/**
 * <p>
 *      DTO object representing a Product.
 * </p>
 * @author Lee Grubb
 * Date: 29/08/2016
 */
public class Product {

    private String name;
    private String category;
    private String locationId;

    public Product(String name, String category, String locationId){
        this.name = name;
        this.category = category;
        this.locationId = locationId;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getLocationId() {
        return locationId;
    }
}
