package org.example;

public class Circulo extends Forma {
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calculararea(){
        return 3.1416*this.radio*this.radio;
    }
}
