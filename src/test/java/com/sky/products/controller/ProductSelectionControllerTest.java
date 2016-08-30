package com.sky.products.controller;

import com.sky.products.model.Product;
import com.sky.products.service.CatalogueService;
import com.sky.products.service.CustomerLocationService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Lee Grubb
 * Date: 29/08/2016
 */
@RunWith(MockitoJUnitRunner.class)
public class ProductSelectionControllerTest {

    @Mock
    private CustomerLocationService customerLocationService;

    @Mock
    private CatalogueService catalogueService;

    @Mock
    private Product product;

    private ProductSelectionController subjectUnderTest;

    @Before
    public void setUp() throws Exception {
        subjectUnderTest = new ProductSelectionController();
        ReflectionTestUtils.setField(subjectUnderTest, "customerLocationService", customerLocationService);
        ReflectionTestUtils.setField(subjectUnderTest, "catalogueService", catalogueService);
    }

    @Test
    public void getProductList() throws Exception {
        final String customerId = "002";
        final String locationId = "LONDON";
        final List<Product> products = new ArrayList<>();
        products.add(product);

        Mockito.when(customerLocationService.getCustomerLocationId(customerId)).thenReturn(locationId);
        Mockito.when(catalogueService.getProductsByLocation(locationId)).thenReturn(products);
        List<Product> result = subjectUnderTest.getProductList(customerId);
        Assert.assertEquals(products, result);
    }

}