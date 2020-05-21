package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebAppController {

    @GetMapping("/hello")
    public String helloWord(@RequestParam(value = "message", defaultValue = "World") String message, Model model) {
        model.addAttribute("message", "hello" + message);

        return "hello";
    }

    @GetMapping("/calc")
    public String calculate(@RequestParam(value = "n1", defaultValue = "0") int num1, 
            @RequestParam(value = "n2", defaultValue = "0") int num2, 
            @RequestParam(value = "op", defaultValue = "+") char op, Model model) {
        model.addAttribute("condition", true);

        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        
        int sum = 0;

        if (op == 'p') {
            op = '+';
            sum = num1 + num2;
        } else if (op == '-') {
            sum = num1 - num2;
        } else if (op == '*') {
            sum = num1 * num2;
        } else if (op == 'd') {
            op = '/';
            sum = num1 / num2;
        }

        model.addAttribute("op", op);
        model.addAttribute("sum", sum);

        return "hello";
    }
    

}