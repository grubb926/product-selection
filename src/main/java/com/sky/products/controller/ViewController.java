package com.sky.products.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>
 *      Controller for handling Views.
 * </p>
 * @author Lee Grubb
 * Date: 29/08/2016
 */
@Controller
public class ViewController {

    @RequestMapping("/")
    public String getIndex(){
        return "redirect:products";
    }

    @RequestMapping("/products")
    public String getProductSelectionPage(){
        return "index";
    }

    @RequestMapping(value = "/checkout", method = RequestMethod.GET)
    public String getCheckoutPage(){
        return "index";
    }
}
