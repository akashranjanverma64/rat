package com.my.rat;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/home")
    public String home(){
        return "this is my best rat home page ";
    }
}
