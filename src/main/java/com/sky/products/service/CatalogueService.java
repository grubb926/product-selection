package com.sky.products.service;

import java.util.List;
import com.sky.products.model.Product;
/**
 * <p>
 *
 * </p>
 * @author Lee Grubb
 * Date: 29/08/2016
 */
public interface CatalogueService {

    List<Product> getProductsByLocation(String locationId);
}
