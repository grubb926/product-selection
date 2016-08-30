package com.sky.products.service;

import java.util.List;
import com.sky.products.model.Product;

/**
 * @author Lee Grubb
 * Date: 29/08/2016
 */
public interface CatalogueService {

    /**
     * <p>
     *     Retrieves a list of {@link Product} objects using the supplied locationId.
     * </p>
     * @param locationId to filter products by
     * @return list of {@link Product}s
     */
    List<Product> getProductsByLocation(String locationId);
}
