package com.company;

public class Main {

    public static void main(String[] args) {
       //a. Inicializar un objeto Rectángulo estableciendo ancho y alto.

       Rectangulo rectangulo1 = new Rectangulo(6.1f,3.7f);

       //b. Imprimir por pantalla el alto y ancho.

        System.out.println("El  alto es " + rectangulo1.getAlto() + ". El ancho es: " + rectangulo1.getAncho());

       //c. Imprimir por pantalla el área y perímetro.

        System.out.println("El  area es " + rectangulo1.calcularArea(rectangulo1.getAncho(), rectangulo1.getAlto()));

        System.out.println("El perimetro es " + rectangulo1.calcularPerimetro(rectangulo1.getAncho(), rectangulo1.getAlto()));

       //d. Modificar el alto y el ancho de la instancia.

        rectangulo1.setAlto(5.4f);
        rectangulo1.setAncho(8.0f);

       //e. Imprimir por pantalla nuevamente el cálculo del área y perímetro.

        System.out.println("\nEl  area es " + rectangulo1.calcularArea(rectangulo1.getAncho(), rectangulo1.getAlto()));

        System.out.println("El perimetro es " + rectangulo1.calcularPerimetro(rectangulo1.getAncho(), rectangulo1.getAlto()));

       //f. Inicializar un objeto Rectángulo con los valores por defecto y verificar.

       Rectangulo otroRectangulo = new Rectangulo();

       System.out.println("\nEl  alto es " + otroRectangulo.getAlto() + "\nEl ancho es: " + otroRectangulo.getAncho());

        //******************************************************************************************



    }
}
