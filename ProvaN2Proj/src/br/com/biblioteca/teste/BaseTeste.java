package br.com.biblioteca.teste;

import br.com.biblioteca.servico.BaseServico;

public abstract class BaseTeste<T> implements IBaseTeste<T> {

    protected BaseServico<T> servico;

    public BaseTeste() {

    }

    protected abstract int TestarCriacao();

    protected abstract void TestarLeitura(int Cod);

    protected abstract void TestarLeituras();

    protected abstract void TestarAlteracao(int Cod);

    protected abstract void TestarExclusao(int Cod);

}
