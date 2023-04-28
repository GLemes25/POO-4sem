package br.com.biblioteca.dominio;

import java.time.LocalDate;

public abstract class BaseBiblioteca {

    protected int codigo;
    protected String descricao;
    protected LocalDate dataCadastro;

    public BaseBiblioteca() {
    }

    public BaseBiblioteca(int codigo, String descricao, LocalDate dataCadastro) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "\nBaseBiblioteca [codigo=" + codigo + ", descricao=" + descricao + ", dataCadastro=" + dataCadastro
                + "]\n";
    }

}