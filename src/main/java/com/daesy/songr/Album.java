package com.daesy.songr;

import com.sun.javafx.beans.IDProperty;

@Entity
public class Album {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
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

    public String getImgUrl(){
        return imageUrl;
    }

}
