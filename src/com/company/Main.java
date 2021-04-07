package com.company;

import com.company.CuentaBanco;

import javax.swing.*;
import java.util.Scanner;

public class Main{

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


    //***************************************************************************

        /*//a. Inicialice el objeto con los atributos necesarios

        ItemDeVenta alfajor = new ItemDeVenta(606,"mousse",12,18);

        //b. Imprima por pantalla el objeto inicializado.

        alfajor.mostrarItem(alfajor); */

    //*****************************************************************************

    /*//1. Inicialice una cuenta con un monto inicial de 15000.

        CuentaBanco cliente1 = new CuentaBanco(001,"Raul","Rosales",15000);

    //2. Realice una operación de crédito de 2500.

        cliente1.credito(2500,cliente1);

    //3. Realice una operación de compra de 1500.

        cliente1.debito(1500,cliente1);

    //4. Realice una operación de compra de 30000.

        cliente1.debito(30000,cliente1);

    //5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea correcto.

        cliente1.mostrarCuenta(cliente1);*/

    //********************************************************************************

    //1. Un método que imprima la hora bajo el siguiente formato hh:mm:ss  usando zero a la izquierda ejemplo 13:04:22 .

            Scanner entrada= new Scanner(System.in);
            JOptionPane.showMessageDialog(null,"Vamos a cargar la hora!");
            int flag=0;
            int hora=0;
            int minutos=0;
            int segundos=0;

            do{
                hora= Integer.parseInt(JOptionPane.showInputDialog("ingrese la hora")); //hora= entrada.nextInt();
                if (hora>23 || hora<0){
                    JOptionPane.showMessageDialog(null,"La hora ingresada no es valida, ingresela nuevamente");
                    flag=1;
                }
                else{
                    flag=0;
                }

            }while(flag==1);

            do{
                minutos= Integer.parseInt(JOptionPane.showInputDialog("ingrese los minutos"));
                if (minutos>59 || minutos<0){
                    JOptionPane.showMessageDialog(null,"Los minutos ingresados no son validos, ingreselos nuevamente");
                    flag=1;
                }
                else{
                    flag=0;
                }

            }while(flag==1);

            do{
                segundos= Integer.parseInt(JOptionPane.showInputDialog("ingrese los segundos"));
                if (segundos>59 || segundos<0){
                    JOptionPane.showMessageDialog(null,"Los segundos ingresados no son validos, ingreselos nuevamente");
                    flag=1;
                }
                else{
                    flag=0;
                }

            }while(flag==1);

            entrada.close();

            Hora hora1 =new Hora(hora,minutos,segundos);
            //JOptionPane.showMessageDialog(null,""); // buscar como mostrar la hora con ventana emergente
            hora1.mostrarTiempo(hora1);
            System.out.println("\n");

            //2. Un método que avance en 1 segundo y devuelva la instancia del objeto.

           /* hora1.avanzarUnSegundo(hora1);
            hora1.mostrarTiempo(hora1);*/

            //3. Un método que retroceda en 1 segundo y devuelva la instancia del objeto.

            hora1.retrocederUnSegundo(hora1);
            hora1.mostrarTiempo(hora1);

    }
}
