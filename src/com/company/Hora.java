package com.company;

import java.util.Scanner;

public class Hora {

    private int hora;
    private int minuto;
    private int segundo;

    //Métodos constructores

    public Hora (int hora, int minuto, int segundo){

        this.hora=hora;
        this.minuto=minuto;
        this.segundo=segundo;

    }

    public Hora(){

    }

//Métodos

    public void  mostrarTiempo (Hora tiempo){

        if (tiempo.hora<10)
            System.out.print("0"+tiempo.hora);
        else
            System.out.print(tiempo.hora);

        if (tiempo.minuto<10)
            System.out.print(":0"+tiempo.minuto);
        else
            System.out.print(":"+tiempo.minuto);

        if (tiempo.segundo<10)
            System.out.print(":0"+tiempo.segundo);
        else
            System.out.print(":"+tiempo.segundo);

    }





}

