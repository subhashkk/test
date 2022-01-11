package com.demo.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping(path = "/welcome/{name}")
    public String greet(@PathVariable String name){

        return "Hello " + name ;

    }
}
