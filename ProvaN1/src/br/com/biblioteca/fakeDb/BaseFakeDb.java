package br.com.biblioteca.fakeDb;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseFakeDb<T> {

    protected List<T> tabela;

    public List<T> getTabela() {
        // singleton
        if (this.tabela == null) {
            this.tabela = new ArrayList<T>();
            this.AutoFill();
        }
        return this.tabela;
    }

    public abstract void AutoFill();
}