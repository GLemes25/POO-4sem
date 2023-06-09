package br.com.biblioteca.fakedb;

import java.time.LocalDate;

import br.com.biblioteca.dominio.Autor;

public class AutorFakeDB extends BaseFakeDB<Autor> {

    @Override
    public void AutoFill() {

        this.tabela.add(new Autor(1, "Autor 1", LocalDate.now(), "Nome 1", "sobrenome 1"));
        this.tabela.add(new Autor(2, "Autor 2", LocalDate.now(), "Nome 2", "sobrenome 2"));
        this.tabela.add(new Autor(3, "Autor 3", LocalDate.now(), "Nome 3", "sobrenome 3"));

    }
}
