package com.company;

public class Main<mostrarItem> {

    public static void main(String[] args) {
       /*//a. Inicializar un objeto Rectángulo estableciendo ancho y alto.

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

       System.out.println("\nEl  alto es " + otroRectangulo.getAlto() + "\nEl ancho es: " + otroRectangulo.getAncho());*/

        //******************************************************************************************

        /*//a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de
        //25000.

        Empleado empleado1 = new Empleado(23456345,"Carlos","Gutiérrez",25000);

        //b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de
        //27500.

        Empleado empleado2 = new Empleado(34234123,"Ana", "Sánchez",27500);

        //c. Imprima ambos objetos por pantalla

        empleado1.mostrarEmpleado(empleado1);
        empleado2.mostrarEmpleado(empleado2);

        //d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
        //salario anual del mismo.

        empleado1.setSalario(empleado1.aumentarSalario(empleado1.getSalario(),15));

        empleado1.mostrarEmpleado(empleado1);*/
    }

    //***************************************************************************

        //a. Inicialice el objeto con los atributos necesarios

        ItemDeVenta alfajor = new ItemDeVenta(606,"mousse",12,18);

        //b. Imprima por pantalla el objeto inicializado.

        alfajor.mostrarItem(alfajor); // NO FUNCIONA , REVISAR

}
