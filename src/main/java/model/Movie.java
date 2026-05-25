package model;

import java.time.LocalDate;

public class Movie {


    // Atributos

    public String title;
    public String description;
    public int duration; // minutes
    public String genre;
    public double rating;
    public boolean availability;
    public String producer;
    public double budget; // usd
    public LocalDate releaseDate;

    // Constructor con parámetros

        public Movie(String title, int duration, String genre) {
            this.title = title;
            this.duration = duration;
            this.genre = genre;
            this.releaseDate = LocalDate.now();
            this.availability = true;
    }
    // Sobrecarga de constructor

    public Movie(String title, int duration, String genre, double rating) {
        this(title, duration, genre);
        this.rate(rating);
    }

    // Getters and Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenere() {
        return genre;
    }

    public void setGenere(String genere) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }


    //toString

    @Override
    public String toString() {
        return "Movies{" +
                "  title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", genere='" + genre + '\'' +
                ", year=" + releaseDate +
                ", rating=" + rating +
                ", availability=" + availability +
                ", producer='" + producer + '\'' +
                ", budget=" + budget +
                '}';
    }

    // Métodos

    public void rate(double rating){
        if (rating >= 0 && rating <= 5) {
            this.rating = rating;
        }
    }

} // Class

