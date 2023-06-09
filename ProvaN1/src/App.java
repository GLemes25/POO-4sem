import br.com.biblioteca.dominio.Autor;
import br.com.biblioteca.dominio.Colecao;
import br.com.biblioteca.dominio.Livro;
import br.com.biblioteca.fakeDb.AutorFakeDB;
import br.com.biblioteca.fakeDb.ColecaoFakeDB;
import br.com.biblioteca.fakeDb.LivroFakeDB;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        AutorFakeDB autorDb = new AutorFakeDB();
        System.out.println("\n AUTOR");

        for (Autor autor : autorDb.getTabela()) {
            System.out.println(autor.toString());
        }

        ColecaoFakeDB colecaoDb = new ColecaoFakeDB();
        System.out.println("\n COLEÇAO");

        for (Colecao colecao : colecaoDb.getTabela()) {
            System.out.println(colecao.toString());
        }

        LivroFakeDB livroDb = new LivroFakeDB();
        System.out.println("\n LIVRO");

        for (Livro livro : livroDb.getTabela()) {
            System.out.println(livro.toString());
        }

        // System.out.println("\n COLEÇÃO COM LIVRO ");

        // Colecao colecao0 = colecaoDb.getTabela().get(0);

        // Livro livro0 = livroDb.getTabela().get(0);
        // System.out.println(livro0.codigoISBN);

        // colecao0.livros.add(0, livro0);
        // System.out.println(colecao0.livros.get(0).titulo);

        System.in.read();
    }
}
