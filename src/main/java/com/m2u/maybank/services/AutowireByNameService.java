package com.m2u.maybank.services;

import com.m2u.maybank.services.interfaces.AutowireByName;
import org.springframework.stereotype.Service;

@Service
public class AutowireByNameService implements AutowireByName {
    @Override
    public String autowireByName() {
        return "AutowireByNameService";
    }
}
