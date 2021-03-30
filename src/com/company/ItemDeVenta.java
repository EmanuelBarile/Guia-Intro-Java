package com.company;

public class ItemDeVenta {
    private int identificador;
    private String descripcion;
    private int cantidad;
    private float precioUnitario;

    //Métodos constructores

    public ItemDeVenta(int identificador, String descripcion, int cantidad, float precioUnitario){

        this.identificador=identificador;
        this.descripcion=descripcion;
        this.cantidad=cantidad;
        this.precioUnitario=precioUnitario;
    }

    public ItemDeVenta(){

    }

    //Métodos

    float precioTotal( int cantidad, float precioUnitario){

        float precioTotal=cantidad*precioUnitario;
        return precioTotal;
    }

        public void mostrarItem(ItemDeVenta item){

        System.out.print("ItemVenta[id="+item.identificador);
        System.out.print("\t\tdescripción="+item.descripcion);
        System.out.println("\t\tcantidad="+item.cantidad);
        System.out.println("\t\tpUnitario="+item.precioUnitario);
        System.out.println("\t\tPtotal="+item.precioTotal(item.cantidad,item.precioUnitario));
        System.out.print("]\n");

    }



    //Getters & Setters
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
