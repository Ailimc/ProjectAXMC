package org.example;

public class Tiempo extends Main{
    private int Suma;
    private int Resta;

    public int getSuma() {
        return Suma;
    }

    public void setSuma(int suma) {
        Suma = suma;
    }

    public int getResta() {
        return Resta;
    }

    public void setResta(int resta) {
        Resta = resta;
    }

    private int horas;
    private int minutos;
    private int segundos;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
            return this.horas + "h" + this.minutos + "m" + this.segundos + "s" ;

    }
}
