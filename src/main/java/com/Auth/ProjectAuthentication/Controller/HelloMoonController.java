package com.Auth.ProjectAuthentication.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMoonController {

    @RequestMapping("/")
    public String index(){
        return "Deu certo";
    }
}
