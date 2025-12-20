package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Yo, the first Spring Boot!";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(defaultValue = "FreeStylo") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
