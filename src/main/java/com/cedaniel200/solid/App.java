package com.cedaniel200.solid;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        limpiar();
        menu();
        do {
            opcion = scanner.nextInt();
            limpiar();
            menu();
            if (opcion == 1) {
                System.out.println(" [] ");
                System.out.println("----|====");
                System.out.println(" /\\");
            } else if (opcion == 2) {
                System.out.println(" [] ");
                System.out.println("----");
                System.out.println(" /\\");
            } else {
                System.out.println("  ? ");
                System.out.println(" [] ");
                System.out.println("----");
                System.out.println(" /\\");
            }
        } while (opcion != 0);
    }

    private static void limpiar() {
        if (System.getProperty("os.name").contains("Windows")) {
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (InterruptedException | IOException e) {
                System.out.println();
            }
        } else {
            System.out.print("\033\143");
        }
    }

    private static void menu() {
        System.out.println("----- Jedi -----");
        System.out.println("0 Terminar");
        System.out.println("1 Encender sable");
        System.out.println("2 Apagar sable");
        System.out.println("----------------");
    }
}