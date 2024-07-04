package main.java;

import java.util.List;

public class MovieLibrary {
    final private List<Movie> movies;

    public MovieLibrary(List<Movie> movies) {
//        movies = new ArrayList<Movie>();
        this.movies = movies;
    }

    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

    public void rateMovie(Movie movie, double rating) {
        movie.setRating(rating);
    }

    public void removeMovie(Movie movie) {
        this.movies.remove(movie);
    }

    public List<Movie> getMovies() {
        return this.movies;
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
