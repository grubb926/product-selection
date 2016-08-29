package com.sky.products.service.impl;

import com.sky.products.exception.CustomerNotFoundException;
import com.sky.products.service.CustomerLocationService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * </p>
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

    @Override
    public String getCustomerLocationId(String customerId) throws CustomerNotFoundException {
        if(!userLocationMap.containsKey(customerId)){
            throw new CustomerNotFoundException();
        }

        return userLocationMap.get(customerId);
    }
}
