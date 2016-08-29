package com.sky.products.service.impl;

import com.sky.products.model.Product;
import com.sky.products.service.CatalogueService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Lee Grubb
 * Date: 29/08/2016
 */
@RunWith(MockitoJUnitRunner.class)
public class CatalogueServiceImplTest {

    @Mock
    private Product londonOnlyProduct;

    @Mock
    private Product liverpoolOnlyProduct;

    @Mock
    private Product allLocationsProduct;


    private CatalogueService subjectUnderTest;

    @Before
    public void setUp(){
        Mockito.when(londonOnlyProduct.getLocationId()).thenReturn("LONDON");
        Mockito.when(liverpoolOnlyProduct.getLocationId()).thenReturn("LIVERPOOL");
        Mockito.when(allLocationsProduct.getLocationId()).thenReturn("");

        subjectUnderTest = new CatalogueServiceImpl();
        ReflectionTestUtils.setField(subjectUnderTest, "productList", createFullProductList());
    }

    @Test
    public void getProductsByLocationWhenLocationEqualsLondon() throws Exception {
        final List<Product> productList = new ArrayList<>();
        final List<Product> result = subjectUnderTest.getProductsByLocation("LONDON");

        productList.add(londonOnlyProduct);
        productList.add(allLocationsProduct);
        assertEquals(productList, result);
    }

    @Test
    public void getProductsByLocationWhenLocationEqualsLiverpool() throws Exception {
        final List<Product> productList = new ArrayList<>();
        final List<Product> result = subjectUnderTest.getProductsByLocation("LIVERPOOL");

        productList.add(liverpoolOnlyProduct);
        productList.add(allLocationsProduct);
        assertEquals(productList, result);
    }

    @Test
    public void getProductsByLocationWhenLocationEqualsOther() throws Exception {
        final List<Product> productList = new ArrayList<>();
        final List<Product> result = subjectUnderTest.getProductsByLocation("CHESTER");

        productList.add(allLocationsProduct);
        assertEquals(productList, result);
    }

    private List<Product> createFullProductList(){
        final List<Product> productList = new ArrayList<>();
        productList.add(londonOnlyProduct);
        productList.add(liverpoolOnlyProduct);
        productList.add(allLocationsProduct);
        return productList;
    }
}