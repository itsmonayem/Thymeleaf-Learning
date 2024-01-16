package com.spring.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Controller
public class MyController {

    @GetMapping("/about")
    public String about(Model model) {
        System.out.println("Going to inside about handler");

        model.addAttribute("name", "monayem");
        model.addAttribute("currentDate", new Date().toString());
        return "about";
    }


    //Handling iteration
    @GetMapping("/loop")
    public String iteration(Model model) {
        List<String> names = List.of("Monayem","Rasel","Abijubi");
        model.addAttribute("names",names);
        return "iterate";
    }


    //Condition handler
    @GetMapping("/condition")
    public String conditionHandler (Model model) {
        model.addAttribute("isActive",true);
        model.addAttribute("gender","F");

        List<String> names = List.of("Monayem","Rasel","Abijubi");
        model.addAttribute("list",names);
        return "condition";
    }



    //handler for including fragments
    @GetMapping("/service")
    public String serviceHandler(Model model) {
        model.addAttribute("title","The time is ");
        model.addAttribute("subtitle", LocalDateTime.now().toString());
        return "service";
    }


//    for new about
    @GetMapping("/new-about")
    public String newAbout() {
        return "aboutNew";
    }
}
