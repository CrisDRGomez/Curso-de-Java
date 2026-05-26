import model.Movie;
import service.MovieService;
import plataform.User;
import service.UserServcie;
import utils.ScannerUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static final String APP_NAME = "Platzi Play 🍿";
    public static final String VERSION = "1.0.0";

    public static void main(String[] args) {

        /* ==================================
                    Películas
        ====================================*/
        System.out.println("Welcome to " + APP_NAME + VERSION + "\n");

        String title = ScannerUtils.captureText("What´s the title of the movie you want to watch");
        String genre = ScannerUtils.captureText("What´s the genre of the movie you want to watch");
        int duration = ScannerUtils.captureInteger("What´s the duration of the movie you want to watch");
        double rating = ScannerUtils.captureDouble("What´s the rating of the movie you want to watch");

        // Instanciamos un objeto nuevo llamado m de la clase Movie desde el constructor vacío
        Movie movie = new Movie(title, duration, genre, rating);
        movie.setRating(50.0);


        System.out.println(MovieService.getMovieDetails(movie));

        /* ====== CASTEO DE TIPOS DE DATOS Y PARSEO DE STRINGS ======

        // Ejemplo de Casteo implicito
        long durationLong = m.duration;
            System.out.println("Duración de la película: " + durationLong + " minutos\n");

        // Ejemplo de Casteo explicito
        int ratingInt = (int) m.rating;
            System.out.println("Rating de la película: " + ratingInt + "/5\n");

        // Ejemplo de parseo de String a long
        long numberOfAwards = Long.parseLong("3");
            System.out.println("Número de premios: " + numberOfAwards + "\n");

        ===============================================================*/

            // Método para mostrar la ficha técnica de la película
        //    System.out.println(MovieService.getMovieDetails(m));


            /* ==================================
                        Usuarios
            ====================================*/

        // Instanciamos un objeto nuevo llamado user de la clase User
        User user = new User("Christopher", "tu@correo.com", "123456", "México", 29, LocalDateTime.of(2025, 5, 18, 22, 12, 10));

        // Imprimimos los datos del usuario registrado
        System.out.println("Usuario registrado: " + user.getName() + ", Email: " + user.getEmail() + ", País: " + user.getCountry() + ", Edad: " + user.getAge() + ", Fecha de registro: " + user.getRegistrationDate());
        // Imprimimos solo la fecha de registro del usuario
        System.out.println(user.getRegistrationDate());

    } // Main
} // Class
