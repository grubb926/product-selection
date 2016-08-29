package com.sky.products.service.impl;

import com.sky.products.exception.CustomerNotFoundException;
import com.sky.products.service.CustomerLocationService;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * @author Lee Grubb
 * Date: 29/08/2016
 */
public class CustomerLocationServiceImplTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    private Map<String, String> userLocationMap;

    private CustomerLocationService subjectUnderTest;

    @Before
    public void setUp(){
        createLocationMap();
        subjectUnderTest = new CustomerLocationServiceImpl();
        ReflectionTestUtils.setField(subjectUnderTest, "userLocationMap", userLocationMap);
    }

    @Test
    public void getCustomerLocationIdForValidUser() throws Exception {
        String result = subjectUnderTest.getCustomerLocationId("valid");
        assertEquals("LIVERPOOL", result);
    }

    @Test
    public void getCustomerLocationIdForInvalidUser() throws CustomerNotFoundException {
        exception.expect(CustomerNotFoundException.class);
        subjectUnderTest.getCustomerLocationId(null);
    }

    private void createLocationMap(){
        userLocationMap = new HashMap<>();
        userLocationMap.put("valid", "LIVERPOOL");
    }

}