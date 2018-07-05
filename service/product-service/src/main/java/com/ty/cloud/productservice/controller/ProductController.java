package com.ty.cloud.productservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ProductController {

    @GetMapping("api/product")
    public String GetProduct()
    {
        return Title;
    }

    @Value("${demo.title}")
    public String Title;
}
