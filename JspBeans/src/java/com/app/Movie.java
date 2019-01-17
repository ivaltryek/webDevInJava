/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

/**
 *
 * @author mj
 */
public class Movie {
    private String movieName;
    private String genre;

    public Movie(String genre, String movieName) {
        this.movieName = movieName;
        this.genre = genre;
    }

    public Movie() {
        
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
    
}
