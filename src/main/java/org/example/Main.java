package org.example;

import javax.swing.*;
import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private int Nombre;
    private int Edad;
    private String Direccion;
    private String RFC;

    public int getNombre() {
        return Nombre;
    }

    public void setNombre(int nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public static void main(String[] args) {

        List<Empleado> ListaEmpleados = new ArrayList<>();
        Empleado Nombre= new Empleado();
        Nombre.setNum_empleados(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el nombre del empleado")));
        ListaEmpleados.add(Nombre);
        for (Empleado empleadoactual: ListaEmpleados
             ) {
            JOptionPane.showMessageDialog(null,"Nombre empleado " + Nombre);
            
        }

        List<Cliente> ListaClientes= new ArrayList<>();
        Cliente NombreC= new Cliente();
        NombreC.setNum_afiliado(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el nombre del empleado")));
        ListaEmpleados.add(Nombre);
        for (Empleado empleadoactual: ListaEmpleados
        ) {
            JOptionPane.showMessageDialog(null,"Nombre empleado " + Nombre);

        }





        /*Tiempo tiempo = new Tiempo();
        tiempo.setHoras(5);
        tiempo.setMinutos(34);
        tiempo.setSegundos(27);

        JOptionPane.showMessageDialog(null, tiempo.toString());

        JOptionPane.showMessageDialog(null,tiempo.toString());
         */

    }
}