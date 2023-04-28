package br.com.biblioteca.dominio;

import java.time.LocalDate;

public class Livro extends BaseBiblioteca {
    public String codigoISBN;

    int codigoAutor;
    public String titulo;

    public Livro() {
    }

    public Livro(int codigo, String descricao, LocalDate dataCadastro, String codigoISBN, int codigoAutor,
            String titulo) {
        super(codigo, descricao, dataCadastro);
        this.codigoISBN = codigoISBN;
        this.codigoAutor = codigoAutor;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return super.toString() + "Livro [codigoISBN=" + codigoISBN + ", codigoAutor=" + codigoAutor + ", titulo="
                + titulo + "]\n";
    }

}
