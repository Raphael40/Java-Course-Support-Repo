package main.java;

public class Movie {
    private String title;
    private String director;
    private double rating;
    private int year;

    public Movie(String title, String director, double rating, int year) {
        this.title = title;
        this.director = director;
        this.rating = rating;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
