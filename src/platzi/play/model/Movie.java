package platzi.play.model;

public class Movie {


    // Atributos

    public String title;
    public String description;
    public int duration; // minutes
    public String genere;
    public int year;
    public int rating;
    public boolean availability;
    public String producer;
    public double budget; // usd

    // Constructor vacío

    public Movie() {
    }

    // Constructor con parámetros

    public Movie(String title, String description, int duration, String genere, int year, int rating, boolean availability, String producer, double budget) {
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.genere = genere;
        this.year = year;
        this.rating = rating;
        this.availability = availability;
        this.producer = producer;
        this.budget = budget;
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
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRating() {
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

    //toString

    @Override
    public String toString() {
        return "Movies{" +
                "  title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", genere='" + genere + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                ", availability=" + availability +
                ", producer='" + producer + '\'' +
                ", budget=" + budget +
                '}';
    }
}