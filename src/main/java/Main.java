import model.Movie;
import service.MovieService;
import plataform.User;
import service.UserServcie;
import utils.ScannerUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*=================================================
    Ejemplo con Scanner para pedir datos al usuario
=================================================*/

//        System.out.println("Hello world!");
//
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter your name: ");
//    String name = sc.nextLine();
//
//        System.out.println("Hello " + name + "!");
//
//        System.out.println("\nEnter your age: ");
//        int age = sc.nextInt();
//
//        System.out.println("Your age is: " + age);

/* ==================================
            Películas
====================================*/
    String name = ScannerUtils.captureText("Enter your name");


    // Instanciamos un objeto nuevo llamado shrek de la clase Movie desde el constructor con parámetros
    Movie shrek = new Movie ("Shrek 1", "Everyone know Shrek", 94, "Animated", LocalDate.of(2001, 5, 18), 5, true, "DreamWorks", 60000000);

    // Instanciamos un objeto nuevo llamado m de la clase Movie desde el constructor vacío
    Movie m = new Movie();
    m.title = "Shrek 2";
    m.description = "Shrek and Fiona visit her parents, the king and queen of Far Far Away, but things don't go as planned.";
    m.duration = 93;
    m.genere = "Animated";
    m.releaseDate = LocalDate.of(2004, 5, 19);
    m.rating = 4.5;
    m.availability = true;
    m.producer = "DreamWorks";
    m.budget = 150000000;

    // Ejemplo de Casteo implicito
    long durationLong = m.duration;
        System.out.println("Duración de la película: " + durationLong + " minutos\n");

    // Ejemplo de Casteo explicito
    int ratingInt = (int) m.rating;
        System.out.println("Rating de la película: " + ratingInt + "/5\n");

    // Ejemplo de parseo de String a long
    long numberOfAwards = Long.parseLong("3");
        System.out.println("Número de premios: " + numberOfAwards + "\n");

    // Método para mostrar la ficha técnica de la película
    System.out.println(MovieService.getMovieDetails(m));




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
