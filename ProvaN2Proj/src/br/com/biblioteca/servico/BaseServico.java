package br.com.biblioteca.servico;

import br.com.biblioteca.repositorio.BaseRepositorio;

public abstract class BaseServico<T> implements IBaseServico<T> {

    protected BaseRepositorio<T> repositorio;

    public BaseServico() {
    }

}
