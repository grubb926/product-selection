package com.sky.products.exception;

/**
 * @author Lee Grubb
 * Date: 29/08/2016
 */
public class CustomerNotFoundException extends Exception {

    public CustomerNotFoundException(){
        super("There was a problem retrieving the customer information");
    }
}
