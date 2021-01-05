package com.mapsa.service.order;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("ordertest")
public class TestController {

    @GetMapping
    public Date testDate(){
        return new Date();
    }
}
