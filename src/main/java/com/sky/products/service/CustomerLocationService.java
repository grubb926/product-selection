package com.sky.products.service;

import com.sky.products.exception.CustomerNotFoundException;

/**
 * <p>
 *
 * </p>
 * @author Lee Grubb
 * Date: 29/08/2016
 */
public interface CustomerLocationService {

    String getCustomerLocationId(String customerId) throws CustomerNotFoundException;
}
