package com.m2u.maybank.controller;

import com.m2u.maybank.services.interfaces.AutowireByName;
import com.m2u.maybank.services.interfaces.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/autowireByname")
public class AutowireByNameController {

    @Autowired
    public AutowireByName autowireByNameService;

    @GetMapping("/test")
    public String fetchCharectorstics() {
        return autowireByNameService.autowireByName();
    }
}
