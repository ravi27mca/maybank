package com.m2u.maybank.controller;

import com.m2u.maybank.services.interfaces.Animal;
import com.m2u.maybank.services.interfaces.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/car")
public class PrimaryAnnotatioSampleController {


    @Autowired
    public Car car; 

    @GetMapping("/car1")
    public String fetchCharectorstics() {
        return car.charectertsics();
    }
}
