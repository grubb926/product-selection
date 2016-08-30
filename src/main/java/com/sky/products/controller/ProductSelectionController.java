package com.sky.products.controller;

import com.sky.products.exception.CustomerInformationException;
import com.sky.products.model.Product;
import com.sky.products.service.CatalogueService;
import com.sky.products.service.CustomerLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *      Controller for Product Selection requests.
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

    /**
     * <p>
     *     Evokes the {@link CatalogueService} to retrieve a list of Products after finding the Location ID assigned to the given customer
     *     via the {@link CustomerLocationService}.
     * </p>
     * @param customerId ID of the customer
     * @return a list of {@link Product} objects
     * @throws CustomerInformationException if the customerId doesn't exist
     */
    @RequestMapping("/products.json")
    public @ResponseBody List<Product> getProductList(@CookieValue(value = "customerId", defaultValue = "001") String customerId) throws CustomerInformationException {
        final String locationId = customerLocationService.getCustomerLocationId(customerId);
        return catalogueService.getProductsByLocation(locationId);
    }

    @ExceptionHandler(CustomerInformationException.class)
    public String handleCustomerNotFound(){
        //TODO - Implement
        return "";
    }

}
