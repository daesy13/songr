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

    @GetMapping("/album")
    public String getAlbum(Model m){
        Album[] entries = new Album[] {
                new Album("Flaming Hot Cheetos", Date.valueOf("2020-01-20"), 10000, "these were delicious"),
                new Album("yogurt", Date.valueOf("2020-01-12"), 180, "yum")
        };
        m.addAttribute("entries", entries);
        return "album";
    }

}
