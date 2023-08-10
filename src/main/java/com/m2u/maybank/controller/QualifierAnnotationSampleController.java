package com.m2u.maybank.controller;

import com.m2u.maybank.services.interfaces.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/animal")
public class QualifierAnnotationSampleController {
    @Qualifier("cat")
    @Autowired
    public Animal animal;

    @GetMapping("/dog")
    public String fetchCharectorstics() {
        return animal.charectertsics();
    }
}
