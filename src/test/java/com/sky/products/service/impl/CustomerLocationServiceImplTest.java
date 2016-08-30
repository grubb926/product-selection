package com.sky.products.service.impl;

import com.sky.products.exception.CustomerInformationException;
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

    private CustomerLocationService subjectUnderTest;

    @Before
    public void setUp(){
        subjectUnderTest = new CustomerLocationServiceImpl();
        ReflectionTestUtils.setField(subjectUnderTest, "userLocationMap", createLocationMap());
    }

    @Test
    public void getCustomerLocationIdForValidUser() throws Exception {
        String result = subjectUnderTest.getCustomerLocationId("valid");
        assertEquals("LIVERPOOL", result);
    }

    @Test
    public void getCustomerLocationIdForInvalidUser() throws CustomerInformationException {
        exception.expect(CustomerInformationException.class);
        subjectUnderTest.getCustomerLocationId(null);
    }

    private Map<String, String> createLocationMap(){
        Map<String, String> userLocationMap = new HashMap<>();
        userLocationMap.put("valid", "LIVERPOOL");
        return userLocationMap;
    }

}