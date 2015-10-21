package org.ometa.rottentomatoes;

import java.util.ArrayList;

/**
 * Created by devin on 10/20/15.
 */
public class Movie {
    public String title;
    public String posterUrl;
    public float criticScore;

    public Movie(String title, String posterUrl, float criticScore) {
        this.title = title;
        this.posterUrl = posterUrl;
        this.criticScore = criticScore;
    }

    public String Score() {
        return criticScore + "%";
    }



    // fake; returns 3 fake movies
    public static ArrayList<Movie> getFakeMovies() {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Fantastic Four", "bar", 45.0f));
        movies.add(new Movie("Interstellar", "bar", 70.0f));
        movies.add(new Movie("Inside Out", "bar", 55.0f));
        return movies;
    }
}
