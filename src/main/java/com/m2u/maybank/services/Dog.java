package com.m2u.maybank.services;

import com.m2u.maybank.services.interfaces.Animal;
import org.springframework.stereotype.Service;

@Service
public class Dog implements Animal {
    @Override
    public String charectertsics() {
        return "Bark";
    }
}
