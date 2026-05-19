package platzi.play;

import platzi.play.model.Movie;
import platzi.play.service.MovieService;
import platzi.play.plataform.User;
import platzi.play.service.UserServcie;

public class Main {
    public static void main(String[] args) {
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

    Movie shrek = new Movie ("Shrek 1", "Everyone know Shrek", 94, "Animated", 2001, 5, true, "DreamWorks", 60000000);

    Movie m = new Movie();
    m.title = "Shrek 2";
    m.description = "Shrek and Fiona visit her parents, the king and queen of Far Far Away, but things don't go as planned.";
    m.duration = 93;
    m.genere = "Animated";
    m.year = 2004;
    m.rating = 4;
    m.availability = true;
    m.producer = "DreamWorks";
    m.budget = 150000000;

    System.out.println(MovieService.getMovieDetails(m));

    User user = new User("Christopher", "tu@correo.com", "123456", "México", 29);

        System.out.println("Usuario registrado: " + user.getName() + ", Email: " + user.getEmail() + ", País: " + user.getCountry() + ", Edad: " + user.getAge());
    } // Main
} // Class
