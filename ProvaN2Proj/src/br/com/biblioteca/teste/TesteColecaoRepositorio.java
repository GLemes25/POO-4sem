package br.com.biblioteca.teste;

import java.util.List;

import br.com.biblioteca.dominio.Colecao;
import br.com.biblioteca.repositorio.ColecaoRepositorio;

public class TesteColecaoRepositorio {

    private ColecaoRepositorio repositorio;

    public TesteColecaoRepositorio() {
        this.repositorio = new ColecaoRepositorio();
    }

    public void Executar() {
        List<Colecao> Colecaos = this.repositorio.Read();
        for (Colecao tupla : Colecaos) {
            System.out.println(tupla.toString());
        }
    }
}
