package com.sky.products.controller;

import com.sky.products.exception.CustomerNotFoundException;
import com.sky.products.model.Product;
import com.sky.products.service.CatalogueService;
import com.sky.products.service.CustomerLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *
 * </p>
 * @author Lee Grubb
 * Date: 29/08/2016
 */
@Controller
public class ProductSelectionController {

    @Autowired
    private CustomerLocationService customerLocationService;

    @Autowired
    private CatalogueService catalogueService;

    @RequestMapping("/")
    public String getProductSelectionPage(){
        return "products";
    }

    @RequestMapping("/products.json")
    public @ResponseBody List<Product> getProductList(@CookieValue(value = "customerId", defaultValue = "001") String customerId){
        String locationId = null;

        try {
            locationId = customerLocationService.getCustomerLocationId(customerId);
        } catch (CustomerNotFoundException e) {
            e.printStackTrace();
        }

        return catalogueService.getProductsByLocation(locationId);
    }
}
