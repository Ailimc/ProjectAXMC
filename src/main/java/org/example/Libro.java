package org.example;

public class Libro {
    private String CodigoISBN;
    private String Titulo;
    private String Autor;
    private String Editorial;
    private String categoria;
    private int Num_ejemplares;

    public String getCodigoISBN() {
        return CodigoISBN;
    }

    public void setCodigoISBN(String codigoISBN) {
        CodigoISBN = codigoISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {

        Editorial = editorial;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNum_ejemplares() {
        return Num_ejemplares;
    }

    public void setNum_ejemplares(int num_ejemplares) {
        Num_ejemplares = num_ejemplares;
    }
}