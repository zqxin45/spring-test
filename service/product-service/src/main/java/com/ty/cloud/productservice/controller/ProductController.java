package com.ty.cloud.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("api/product")
    public String GetProduct()
    {
        return "first product";
    }
}
