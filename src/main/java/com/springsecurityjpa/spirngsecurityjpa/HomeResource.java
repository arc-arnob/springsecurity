package com.springsecurityjpa.spirngsecurityjpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
    
    @GetMapping("/")
    public String home(){
        return ("Welcome NO AUTH required");
    }

    @GetMapping("/user")
    public String user(){
        return ("Welcome user");
    }
    
    @GetMapping("/admin")
    public String admin(){
        return ("Welcome admin");
    }

}