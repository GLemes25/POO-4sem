package br.com.biblioteca.servico;

import java.util.List;

public interface IBaseServico<T> {
    T Criar(T obj);

    T Ler(int chave);

    List<T> Ler();

    T Atualizar(T obj);

    T Delete(int chave);

}