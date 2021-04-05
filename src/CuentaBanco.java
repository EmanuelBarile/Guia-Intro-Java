package com.company;
public class CuentaBanco {

    private int identificador;
    private String nombre;
    private String apellido;
    private float balance;


    //Métodos constructores

    public CuentaBanco (int identificador, String nombre, String apellido, float balance){
        this.identificador=identificador;
        this.nombre=nombre;
        this.apellido=apellido;
        this.balance=balance;
    }

    public CuentaBanco(){

    }

    float credito (float deposito, CuentaBanco cuenta){
        cuenta.balance+= deposito;
        return cuenta.balance;
    }

    float debito(float sustraccion, CuentaBanco cuenta){

        if (sustraccion> cuenta.balance){
            System.out.println("el importe a debitar excede los fondos de la cuenta, no es posible realizar la operacion");
        }
        else{
            cuenta.balance-=sustraccion;
        }
        return cuenta.balance;

    }

    void mostrarCuenta(CuentaBanco cuenta){

        System.out.println("Cuenta [Identificador: "+this.identificador+"  Nombre: "+this.getNombre()+"  Apellido:  "+this.getApellido()+   "  Balance: "+this.getBalance());

    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public  float getBalance(){
        return balance;
    }
}
