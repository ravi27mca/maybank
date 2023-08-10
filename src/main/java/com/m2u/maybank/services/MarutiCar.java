package com.m2u.maybank.services;

import com.m2u.maybank.services.interfaces.Car;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class MarutiCar implements Car {
    @Override
    public String charectertsics() {
        return "MarutiCar";
    }
}
