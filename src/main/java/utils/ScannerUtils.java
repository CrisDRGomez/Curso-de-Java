package utils;

import java.util.Scanner;

public class ScannerUtils {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static String captureText(String mesage) {
        System.out.println(mesage + ": ");
        return SCANNER.nextLine(); // Simulando la lectura de un texto desde el teclado.
    }

    public static int captureInteger(String mesage) {
        System.out.println(mesage + ": ");

        int data = SCANNER.nextInt();
        SCANNER.nextLine(); // Limpiar el buffer del scanner después de leer un número.
        return data; // Simulando la lectura de un número entero desde el teclado.
    }


    public static double captureDouble(String mesage) {
        System.out.println(mesage + ": ");

        double data = SCANNER.nextDouble();
        SCANNER.nextLine(); // Limpiar el buffer del scanner después de leer un número.
        return data; // Simulando la lectura de un número entero desde el teclado.
    }
}
