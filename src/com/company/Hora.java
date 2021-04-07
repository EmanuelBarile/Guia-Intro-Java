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


    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }


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

    public Hora avanzarUnSegundo(Hora hora){

        if(hora.hora==23 && hora.minuto==59 && hora.segundo==59){
            this.hora=0;
            this.minuto=0;
            this.segundo=0;
        }
        else if(hora.minuto==59 && hora.segundo==59){
            this.hora++;
            this.minuto=0;
            this.segundo=0;
        }
        else if(hora.segundo==59){
            this.minuto++;
            this.segundo=0;
        }
        else {
            this.segundo++;
        }

        return hora;

    }

    public Hora retrocederUnSegundo(Hora hora){

        if(hora.hora==0 && hora.minuto==0 && hora.segundo==0){
            this.hora=23;
            this.minuto=59;
            this.segundo=59;
        }
        else if(hora.minuto==0 && hora.segundo==0){
            this.hora--;
            this.minuto=59;
            this.segundo=59;
        }
        else if(hora.segundo==0){
            this.minuto--;
            this.segundo=59;
        }
        else {
            this.segundo--;
        }

        return hora;

    }

}

