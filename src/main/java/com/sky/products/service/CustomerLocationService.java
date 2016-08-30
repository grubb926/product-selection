package com.sky.products.service;

import com.sky.products.exception.CustomerInformationException;

/**
 * @author Lee Grubb
 * Date: 29/08/2016
 */
public interface CustomerLocationService {

    /**
     * <p>
     *     Retrieves the Location ID assigned to a customer by using their customerId.
     * </p>
     * @param customerId ID of the customer
     * @return Location ID as a String
     * @throws CustomerInformationException if the supplied customerId doesn't exist
     */
    String getCustomerLocationId(String customerId) throws CustomerInformationException;
}
