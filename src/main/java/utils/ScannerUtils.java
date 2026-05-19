package utils;

import java.util.Scanner;

public class ScannerUtils {

    public static Scanner scanner = new Scanner(System.in);

    public static String captureText(String mesage) {
        System.out.println(mesage + ": ");
        return "Simulando la lectura de una línea de texto desde el teclado.";
    }

    public int captureInteger(String mesage) {
        System.out.println(mesage + ": ");

        int data = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner después de leer un número.
        return data; // Simulando la lectura de un número entero desde el teclado.
    }


    public double captureDouble(String mesage) {
        System.out.println(mesage + ": ");

        double data = scanner.nextDouble();
        scanner.nextDouble(); // Limpiar el buffer del scanner después de leer un número.
        return data; // Simulando la lectura de un número entero desde el teclado.
    }
}
