package com.m2u.maybank.controller;

import com.m2u.maybank.services.interfaces.AutowireByName;
import com.m2u.maybank.services.interfaces.AutowireByType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/autowireByType")
public class AutowireByTypeController {

    public AutowireByType autowireByType;

    public void setAutowireByType(@Qualifier("autowireByTypeService0") AutowireByType autowireByType) {
        this.autowireByType = autowireByType;
    }

    @GetMapping("/type")
    public String fetchCharectorstics() {
        return autowireByType.autowireByType();
    }
}
