package br.com.biblioteca.dominio;

import java.time.LocalDate;

public class Autor extends BaseBiblioteca {

    public String Nome;
    public String sobreNome;

    public Autor() {
    }

    public Autor(int codigo, String descricao, LocalDate dataCadastro, String nome, String sobreNome) {
        super(codigo, descricao, dataCadastro);
        Nome = nome;
        this.sobreNome = sobreNome;
    }

    @Override
    public String toString() {
        return super.toString() + "Autor [Nome=" + Nome + ", sobreNome=" + sobreNome + "]\n";
    }

}
