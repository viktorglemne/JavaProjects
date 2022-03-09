package com.glemne;

public class App {
    public static void main(String[] args) {
        Movie movie1 = new Movie("nalle phu", "josef", "pg-13");
        Movie movie2 = new Movie("dancing", "emil", "R");

        movie1.setRating("pg-13");
        System.out.println(movie1.rating);

    }
}
