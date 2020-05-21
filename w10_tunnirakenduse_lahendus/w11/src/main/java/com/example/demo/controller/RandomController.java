package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/* import org.springframework.web.bind.annotation.RequestParam; */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class RandomController {
    @GetMapping("/random")
    public String random( Model model) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            Random rand = new Random();
            int n = rand.nextInt(50);
            list.add(n);
        }
        model.addAttribute("list", list);

        return "random";
    }
}