package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un año:");
        int año = scanner.nextInt();
        System.out.println("Introduce un mes:");
        int mes = scanner.nextInt();
        System.out.println("Introduce un dia:");
        int dia = scanner.nextInt();

        Calendario cal1 = new Calendario(año,mes,dia);

        System.out.println("Incrementa los dias, meses y años e intenta adivinarlo!");

        System.out.println("Introduce un numero para incrementar en años:");
        int cantAño = scanner.nextInt();
        cal1.incrementarAño(cantAño);

        System.out.println("Introduce un numero para incrementar en meses:");
        int cantMes = scanner.nextInt();
        cal1.incrementarMes(cantMes);

        System.out.println("Introduce un numero para incrementar en dias:");
        int cantDia = scanner.nextInt();
        cal1.incrementarDia(cantDia);

        System.out.println("Ahora intenta adivinarlo y te ire si has acertado o no!");
        System.out.println("Dia?");
        int dia2 = scanner.nextInt();
        System.out.println("Mes?");
        int mes2 = scanner.nextInt();
        System.out.println("Año?");
        int año2 = scanner.nextInt();

        Calendario otraFecha = new Calendario(año2,mes2,dia2);

        if (cal1.iguales(otraFecha)){
            System.out.println("Has acertado!");
            System.out.print("Primera fecha:");
            cal1.mostrar();
            System.out.print("Segunda fecha:");
            otraFecha.mostrar();
        } else {
            System.out.println("No has acertado!");
            System.out.print("Primera fecha:");
            cal1.mostrar();
            System.out.print("Segunda fecha:");
            otraFecha.mostrar();
        }
    }
}
