package com.daesy.songr;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String title;
    String artist;
    int songCount;
    int length;
    String imageUrl;

    public Album(String title, String artist, int songCount, int length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    // Default constructor for JPA
    public Album(){}

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
}
