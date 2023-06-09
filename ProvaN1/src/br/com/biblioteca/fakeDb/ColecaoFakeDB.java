package br.com.biblioteca.fakeDb;

import java.time.LocalDate;

import br.com.biblioteca.dominio.Colecao;

public class ColecaoFakeDB extends BaseFakeDb<Colecao> {

    @Override
    public void AutoFill() {

        this.tabela.add(new Colecao(1, "Coleção 1", LocalDate.now(), "Editora 1"));
        this.tabela.add(new Colecao(2, "Coleção 2", LocalDate.now(), "Editora 2"));
        this.tabela.add(new Colecao(3, "Coleção 3", LocalDate.now(), "Editora 3"));
        this.tabela.add(new Colecao(4, "Coleção 4", LocalDate.now(), "Editora 4"));
        this.tabela.add(new Colecao(5, "Coleção 5", LocalDate.now(), "Editora 5"));
    }
}
