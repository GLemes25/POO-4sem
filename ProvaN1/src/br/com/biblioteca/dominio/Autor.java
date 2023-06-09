package br.com.biblioteca.dominio;

import java.time.LocalDate;

public class Autor extends BaseBiblioteca {

    private String Nome;
    private String sobreNome;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

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
