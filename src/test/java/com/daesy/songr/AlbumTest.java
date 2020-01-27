package com.daesy.songr;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.transaction.BeforeTransaction;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlbumTest {

    Album myAlbum;
    String title;
    String artist;
    int songCount;
    int length;
    String imageUrl;

//    Reference: http://junit.sourceforge.net/javadoc/org/junit/Before.html
    @BeforeEach
    public void initializer(){
        myAlbum = new Album("Nevermind", "Nirvana", 3, 300, "https://images-na.ssl-images-amazon.com/images/I/71DQrKpImPL._SL1400_.jpg" );
    }

    @Test
    public void titleTest(){
        String expected = "Nevermind";
        String actual = myAlbum.title;
        assertEquals(expected, actual);
    }

    @Test
    public void titleNoEqualTest(){
        String expected = "Mellon Collie and the Infinite Sadness";
        String actual = myAlbum.title;
        assertNotEquals(expected, actual);
    }

    @Test
    public void titleArtistTest(){
        String expected = "Nirvana";
        String actual = myAlbum.artist;
        assertEquals(expected, actual);
    }

    @Test
    public void artistNoEqualTest(){
        String expected = "Smashing Pumpkins";
        String actual = myAlbum.artist;
        assertNotEquals(expected, actual);
    }

    @Test
    public void songCountTest(){
        int expected = 3;
        int actual = myAlbum.songCount;
        assertEquals(expected,actual);
    }

    @Test
    public void countNoEqualTest(){
        int expected = 5;
        int actual = myAlbum.songCount;
        assertNotEquals(expected, actual);
    }

    @Test
    public void lengthTest(){
        int expected = 300;
        int actual = myAlbum.length;
        assertEquals(expected, actual);
    }

    @Test
    public void lengthNoEqualTest(){
        int expected = 100;
        int actual = myAlbum.length;
        assertNotEquals(expected, actual);
    }

    @Test
    public void imageUrlTest(){
        String expected = "https://images-na.ssl-images-amazon.com/images/I/71DQrKpImPL._SL1400_.jpg";
        String actual = myAlbum.imageUrl;
        assertEquals(expected, actual);
    }

    @Test
    public void imageUrlNoEqualTest(){
        String expected = "www.codefellows.com";
        String actual = myAlbum.imageUrl;
        assertNotEquals(expected, actual);
    }

}
