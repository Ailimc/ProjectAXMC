package org.example;

public class Socio {
    private int Num_identificacion;
    private String Nombre;
    private String Direccion;
    private int Tel;
    private String Fecha_alta;

    public int getNum_identificacion() {
        return Num_identificacion;
    }

    public void setNum_identificacion(int num_identificacion) {
        Num_identificacion = num_identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getTel() {
        return Tel;
    }

    public void setTel(int tel) {
        Tel = tel;
    }

    public String getFecha_alta() {
        return Fecha_alta;
    }

    public void setFecha_alta(String fecha_alta) {
        Fecha_alta = fecha_alta;
    }

    protected void RealizarPrestamos(){

    }
}


