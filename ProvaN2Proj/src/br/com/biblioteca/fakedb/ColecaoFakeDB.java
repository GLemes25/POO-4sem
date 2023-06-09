package br.com.biblioteca.fakedb;

import java.time.LocalDate;

import br.com.biblioteca.dominio.Colecao;

public class ColecaoFakeDB extends BaseFakeDB<Colecao> {

    @Override
    public void AutoFill() {

        this.tabela.add(new Colecao(1, "Coleção 1", LocalDate.now(), "Editora 1"));
        this.tabela.add(new Colecao(2, "Coleção 2", LocalDate.now(), "Editora 2"));
        this.tabela.add(new Colecao(3, "Coleção 3", LocalDate.now(), "Editora 3"));
    }
}
