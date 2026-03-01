package com.cirobtsta.first_spring_app.controller;

import com.cirobtsta.first_spring_app.domain.User;
import com.cirobtsta.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {


    @Autowired
    private HelloWorldService helloWorldService;


    @GetMapping
    public String HelloWorld(){
        return helloWorldService.helloWorld("You");

    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id,
                                 @RequestParam(value = "filter", defaultValue = "nenhum") String filter,
                                 @RequestBody User body){
        return "Hello World: " + filter;
    }

}
