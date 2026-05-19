package service;

import model.Movie;


public class MovieService {

    // METODOS

        // Reproducir pelicula
            public String playMovie(Movie movie) {
                return "Reproduciendo la pelicula: " + movie.getTitle();
            }

        // Pausar pelicula
            public String pauseMovie(Movie movie) {
                return "Pelicula pausada: " + movie.getTitle();
            }

        // Detener pelicula
            public String stopMovie(Movie movie) {
                return "Pelicula detenida: " + movie.getTitle();
            }

        // Obtener ficha técnica
            public static String getMovieDetails(Movie movie) {
                return "Ficha técnica de la pelicula: " + movie.getTitle() + "\n" +
                        "Descripción: " + movie.getDescription() + "\n" +
                        "Duración: " + movie.getDuration() + " minutos\n" +
                        "Género: " + movie.getGenere() + "\n" +
                        "Año: " + movie.releaseDate.getYear() + "\n" +
                        "Rating: " + movie.getRating() + "/5\n" +
                        "Disponibilidad: " + (movie.isAvailability() ? "Disponible" : "No disponible") + "\n" +
                        "Productor: " + movie.getProducer() + "\n" +
                        "Presupuesto: $" + movie.getBudget() + " usd";
            }

        // Calificar pelicula
            public int rateMovie(Movie movie, int rating) {
                try {
                    if (rating < 1 || rating > 5) {
                        throw new IllegalArgumentException("La calificación debe ser entre 1 y 5");
                    }
                    movie.setRating(rating);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                return rating;
            }

        // ¿La pelicula es popular?
            public boolean isPopular(Movie movie) {
                return movie.getRating() >= 4;
            }

} // Class

