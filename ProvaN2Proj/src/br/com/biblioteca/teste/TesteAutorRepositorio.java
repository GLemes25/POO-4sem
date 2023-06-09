package br.com.biblioteca.teste;

import java.util.List;

import br.com.biblioteca.dominio.Autor;
import br.com.biblioteca.repositorio.AutorRepositorio;

public class TesteAutorRepositorio {

    private AutorRepositorio repositorio;

    public TesteAutorRepositorio() {
        this.repositorio = new AutorRepositorio();
    }

    public void Executar() {
        List<Autor> Autors = this.repositorio.Read();
        for (Autor tupla : Autors) {
            System.out.println(tupla.toString());
        }
    }
}
