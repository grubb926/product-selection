package com.sky.products.service.impl;

import com.sky.products.exception.CustomerInformationException;
import com.sky.products.service.CustomerLocationService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Lee Grubb
 * Date: 29/08/2016
 */
@Service
public class CustomerLocationServiceImpl implements CustomerLocationService {

    private Map<String, String> userLocationMap;

    @PostConstruct
    public void init(){
        userLocationMap = new HashMap<>();
        userLocationMap.put("001", "LIVERPOOL");
        userLocationMap.put("002", "LONDON");
        userLocationMap.put("003", "CHESTER");
    }

    /**
     * <p>
     *     Checks that the customerId exists within the userLocationMap, gets the location from the {@link Map} if the
     *     customerId exists otherwise throws a {@link CustomerInformationException}
     * </p>
     * @param customerId ID of the customer
     * @return Location ID as a String
     * @throws CustomerInformationException if the supplied customerId doesn't exist
     */
    @Override
    public String getCustomerLocationId(String customerId) throws CustomerInformationException {
        if(!userLocationMap.containsKey(customerId)){
            throw new CustomerInformationException();
        }

        return userLocationMap.get(customerId);
    }
}
