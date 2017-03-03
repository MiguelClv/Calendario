package com.company;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

/**
 * Created by 54167208T on 02/03/2017.
 */
public class Calendario {
    private LocalDate Fecha;

    public Calendario(int año, int mes, int dia) {
        Fecha = LocalDate.of(año,mes,dia);
    }

    public void incrementarDia(int cantidad){
        Fecha = Fecha.plusDays(cantidad);
    }

    public void incrementarMes(int cantidad){
        Fecha = Fecha.plusMonths(cantidad);
    }

    public void incrementarAño(int cantidad){
        Fecha = Fecha.plusYears(cantidad);
    }

    public void mostrar(){
        System.out.println(Fecha);
    }

    public boolean iguales(Calendario otraFecha){
        return this.Fecha.isEqual(otraFecha.Fecha);
    }
}
