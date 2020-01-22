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
                new Album("Nevermind", "Nirvana", 12, 300, "https://upload.wikimedia" +
                        ".org/wikipedia/en/b/b7/NirvanaNevermindalbumcover.jpg"),
                new Album("Invasion of Privacy", "CardiB", 12, 300, "https://upload.wikimedia" +
                        ".org/wikipedia/en/9/97/Cardi_B_-_Invasion_of_Privacy.png"),
        };
        m.addAttribute("entries", entries);
        return "album";
    }

}
