package com.company;

public class Rectangulo {
    //Atributos
    private float ancho = 1.0F;
    private float alto  = 1.0F;


    //Métodos

    float calcularArea(float ancho, float alto){
        float area= ancho*alto;
        return area;
    }

    float calcularPerimetro (float ancho, float alto){
        float perimetro= (ancho*2)+(alto*2);
        return perimetro;
    }

    // Métodos constructores ( 1 con parametros y otro sin)
    public Rectangulo(float ancho, float alto){
        this.alto=alto;
        this.ancho=ancho;

    }

    public Rectangulo(){

    }

    // getters and setters
    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }
}
