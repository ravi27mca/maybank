package com.m2u.maybank.services;

import com.m2u.maybank.services.interfaces.AutowireByType;
import org.springframework.stereotype.Service;

@Service
public class AutowireByTypeService1 implements AutowireByType {
    @Override
    public String autowireByType() {
        return "AutowireByTypeService1";
    }
}
