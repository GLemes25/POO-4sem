package br.com.biblioteca.repositorio;

import java.util.List;

public abstract class BaseRepositorio<T> implements IBaseRepositorio<T> {

    protected List<T> tabela;

    @Override
    public List<T> Read() {
        return this.tabela;
    }

    @Override
    public T Delete(int chave) {
        T original = this.Read(chave);
        if (original != null) {
            this.tabela.remove(original);
        }
        return original;
    }

}
