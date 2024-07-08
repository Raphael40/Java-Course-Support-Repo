package main.java;

import java.util.List;

public record MovieLibrary(List<Movie> movies) {

    public void addMovie(Movie movie) {
        if (this.movies.contains(movie)) {
            throw new IllegalArgumentException("Movie already exists.");
        }
        this.movies.add(movie);
    }

    public void rateMovie(Movie movie, double rating) {
        movie.setRating(rating);
    }

    public void removeMovie(Movie movie) {
        this.movies.remove(movie);
    }

    public Movie getMovieByTitle(String title) {
        for (Movie movie : this.movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                return movie;
            }
        }
        return null;
    }
}
