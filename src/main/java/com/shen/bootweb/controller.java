package com.shen.bootweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
    @GetMapping(value = {"/","/login"})
        public String loginPage(){
            return "login";
        }
}
