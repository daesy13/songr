package com.daesy.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/capitalize/{wordsUpper}")
    public String capitalize(@PathVariable String wordsUpper, Model m){
        wordsUpper = wordsUpper.toUpperCase();
        m.addAttribute("wordsUpper", wordsUpper );
        return "capitalize";
    }

}
