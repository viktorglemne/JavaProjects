package com.glemne;

public class Movie {
    String title;
    String director;
    String rating;

    public Movie(String title, String director, String rating){
        this.title = title;
        this.director = director;
        this.rating = rating;
    }

    public void setRating(String rating) {

        if (rating.equals("G")|| rating.equals("pg-13")|| rating.equals("R")) {
            this.rating = rating;

        } else {
            this.rating = "NR";
        }
    }
}
