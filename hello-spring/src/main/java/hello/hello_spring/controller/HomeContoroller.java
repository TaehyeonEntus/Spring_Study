package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeContoroller {
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
