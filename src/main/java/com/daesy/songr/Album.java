package com.daesy.songr;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    public String title;
    public String artist;
    public int songCount;
    public int length;
    public String imageUrl;

    @OneToMany(mappedBy = "album")
    public List<Song> songs;

    public Album(String title, String artist, int songCount, int length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    // Default constructor for JPA
    public Album(){}

    public Long getId() {
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public int getSongCount(){
        return songCount;
    }

    public int getLength(){
        return length;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public List<Song> getSongs(){
        return songs;
    }
}
