package br.com.biblioteca.fakeDb;

import java.time.LocalDate;

import br.com.biblioteca.dominio.Livro;

public class LivroFakeDB extends BaseFakeDb<Livro> {

    @Override
    public void AutoFill() {

        this.tabela.add(new Livro(1, "Livro 1", LocalDate.now(), "ISBN 1", 1, "Titulo 1"));
        this.tabela.add(new Livro(2, "Livro 2", LocalDate.now(), "ISBN 2", 2, "Titulo 2"));
        this.tabela.add(new Livro(3, "Livro 3", LocalDate.now(), "ISBN 3", 3, "Titulo 3"));
        this.tabela.add(new Livro(4, "Livro 4", LocalDate.now(), "ISBN 4", 4, "Titulo 4"));
        this.tabela.add(new Livro(5, "Livro 5", LocalDate.now(), "ISBN 5", 5, "Titulo 5"));

    }
}
