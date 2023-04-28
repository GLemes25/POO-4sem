package br.com.biblioteca.dominio;

import java.time.LocalDate;
import java.util.List;

public class Colecao extends BaseBiblioteca {

    public String editora;

    public List<Livro> livros;

    public Colecao() {
    }

    public Colecao(int codigo, String descricao, LocalDate dataCadastro, String editora) {
        super(codigo, descricao, dataCadastro);
        this.editora = editora;
    }

    public Colecao(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {

        return super.toString() + "Colecao [editora=" + editora + ", livros=" + livros + "]\n";
    }

}
