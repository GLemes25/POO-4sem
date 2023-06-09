package br.com.biblioteca.fakedb;

import java.time.LocalDate;

import br.com.biblioteca.dominio.Livro;

public class LivroFakeDB extends BaseFakeDB<Livro> {

    @Override
    public void AutoFill() {

        this.tabela.add(new Livro(1, "Livro 1", LocalDate.now(), "ISBN 1", 1, "Titulo 1"));
        this.tabela.add(new Livro(2, "Livro 2", LocalDate.now(), "ISBN 2", 2, "Titulo 2"));
        this.tabela.add(new Livro(3, "Livro 3", LocalDate.now(), "ISBN 3", 3, "Titulo 3"));
    }
}
