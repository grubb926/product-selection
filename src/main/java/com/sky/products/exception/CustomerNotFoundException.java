package com.sky.products.exception;

/**
 * @author Lee Grubb
 * Date: 23/08/2016
 */
public class CustomerNotFoundException extends Exception {

    public CustomerNotFoundException(){
        super("Customer information could not be retrieved");
    }
}
