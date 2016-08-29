package com.sky.products.service.impl;

import com.sky.products.model.Product;
import com.sky.products.service.CatalogueService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *
 * </p>
 * @author Lee Grubb
 * Date: 29/08/2016
 */
@Service
public class CatalogueServiceImpl implements CatalogueService {

    private List<Product> productList;

    @PostConstruct
    public void init(){
        productList = new ArrayList<>();
        productList.add(new Product("Arsenal TV", "Sports", "LONDON"));
        productList.add(new Product("Chelsea TV", "Sports", "LONDON"));
        productList.add(new Product("Liverpool TV", "Sports", "LIVERPOOL"));
        productList.add(new Product("Sky News", "News", ""));
        productList.add(new Product("Sky Sports News", "News", ""));
    }

    @Override
    public List<Product> getProductsByLocation(String locationId) {
        return productList.stream().filter(product -> locationId.equals(product.getLocationId()) || product.getLocationId().isEmpty()).collect(Collectors.toList());
    }
}
