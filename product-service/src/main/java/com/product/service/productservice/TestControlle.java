package com.product.service.productservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("producttest")
public class TestControlle {
    @GetMapping
    public Date testDate(){
        return new Date();
    }
}
