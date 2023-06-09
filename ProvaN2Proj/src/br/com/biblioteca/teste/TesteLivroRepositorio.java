package br.com.biblioteca.teste;

import java.util.List;

import br.com.biblioteca.dominio.Livro;
import br.com.biblioteca.repositorio.LivroRepositorio;

public class TesteLivroRepositorio {

    private LivroRepositorio repositorio;

    public TesteLivroRepositorio() {
        this.repositorio = new LivroRepositorio();
    }

    public void Executar() {
        List<Livro> Livros = this.repositorio.Read();
        for (Livro tupla : Livros) {
            System.out.println(tupla.toString());
        }
    }
}
