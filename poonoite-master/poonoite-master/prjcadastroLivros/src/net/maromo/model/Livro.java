package net.maromo.model;

public class Livro {
    private int isbn;
    private String titulo;

    //método construtor padrão (pode deixar para o compilador fazer)
    public Livro(){

    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "isbn=" + isbn +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
