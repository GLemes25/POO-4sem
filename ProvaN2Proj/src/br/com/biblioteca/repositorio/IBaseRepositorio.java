package br.com.biblioteca.repositorio;

import java.util.List;

public interface IBaseRepositorio<T> {

    T Create(T obj);

    T Read(int chave);

    List<T> Read();

    T Update(T obj);

    T Delete(int chave);

}
