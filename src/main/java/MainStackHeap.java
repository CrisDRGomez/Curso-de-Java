
import model.Movie;

public class MainStackHeap {
    public static void main(String[] args) {

        Movie lionKing = new Movie("The Lion King", 120, "Animation", 4.5);

        Movie harryPotter = new Movie("Harry Potter and the Sorcerer's Stone", 152, "Fantasy", 4.8);

        lionKing = harryPotter; // lionKing ahora referencia al mismo objeto que harryPotter

        lionKing.title = "The Hobbit"; // Modificamos el título a través de lionKing

        System.out.println("The Lion King: " + lionKing.title);
        System.out.println("Harry Potter: " + harryPotter.title);

    } //Main
} // Class
