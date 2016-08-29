package com.sky.products.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 *
 * </p>
 * @author Lee Grubb
 * Date: 29/08/2016
 */
@Controller
public class ProductSelectionController {

    @RequestMapping("/")
    public String getProductSelectionPage(){
        return "products";
    }
}
