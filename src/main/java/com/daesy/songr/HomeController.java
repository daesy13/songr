package com.daesy.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;

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

    @GetMapping("/albums")
    public String getAlbum(Model m){
        List<Album> entries = albumRepository.findAll();
        m.addAttribute("entries", entries);
        return "albums";
    }

    @PostMapping("/albums")
    public RedirectView addedAlbum(String title, String artist, int songCount, int length, String imageUrl){
        Album newAlbum = new Album(title, artist, songCount, length, imageUrl);
        albumRepository.save(newAlbum);
    return new RedirectView("/albums");
    }

    @GetMapping("/albums/{id}")
    public String getAlbum(@PathVariable Long id, Model m){
        Album album = albumRepository.getOne(id);
        System.out.println(id);
        m.addAttribute("album", album);
        return "album";
    }

    @PostMapping("/single-song")
    public RedirectView addedSongs(Long id, String title, int length, int trackNumber){
        Song newSong = new Song(title, length, trackNumber);
        newSong.album = albumRepository.findById(id).get();
        songRepository.save(newSong);
        return new RedirectView("/albums/" + id);
    }

}
