package com.company;

public class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private float salario;


    //getters & setters
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    //Métodos constructores

    public Empleado (int dni, String nombre, String apellido, float salario){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.salario=salario;
    }

    public Empleado (){

    }

    //Métodos

    float calcularSalarioAnual( float salario){

        float salarioAnual= salario*12;
        return  salarioAnual;
    }

    float aumentarSalario (float salario, float porcentaje ){
        float salarioActualizado = salario +  (salario * porcentaje) /100;
        return  salarioActualizado;

    }

        public  void mostrarEmpleado (Empleado empleado){

        System.out.println("Empleado[DNI: "+this.getDni()+"  Nombre: "+this.getNombre()+"   Apellido: "+this.getApellido()+"  Salario: "+this.getSalario()+"]");
    }



}
