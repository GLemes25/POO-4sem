package br.com.biblioteca.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.biblioteca.dominio.Livro;
import br.com.biblioteca.servico.LivroServico;

public class LivroTeste extends BaseTeste<Livro> {

    public LivroTeste() {
        this.servico = new LivroServico();
    }

    @Override
    public void Executar() {
        int cod = this.TestarCriacao();
        this.TestarLeitura(cod);
        this.TestarLeituras();
        this.TestarAlteracao(cod);
        this.TestarExclusao(cod);
        this.TestarLeituras();

    }

    @Override
    public int TestarCriacao() {
        System.out.println("\nTestarCriacao");

        Livro Livro = new Livro(4, "Livro 4", LocalDate.now(), "ISBN 4", 4, "Titulo 4");
        Livro novo = this.servico.Criar(Livro);
        System.out.println(novo.toString());
        return novo.getCodigo();
    }

    @Override
    protected void TestarLeitura(int Cod) {
        System.out.println("\nTestarLeitura");

        Livro Livro = this.servico.Ler(Cod);
        System.out.println(Livro.toString());

    }

    @Override
    protected void TestarLeituras() {
        System.out.println("\nTestarLeituras");

        List<Livro> lista = this.servico.Ler();

        for (Livro Livro : lista) {
            System.out.println(Livro.toString());
        }
    }

    @Override
    protected void TestarAlteracao(int Cod) {
        System.out.println("\nTestarAlteracao");
        Livro antigo = this.servico.Ler(Cod);
        antigo.setTitulo("TituloAlterado");

        Livro alterada = this.servico.Atualizar(antigo);

        System.out.println(alterada.toString());
    }

    @Override
    protected void TestarExclusao(int Cod) {
        System.out.println("\nTestarExclusao");

        Livro alvo = this.servico.Ler(Cod);

        Livro excluido = this.servico.Delete(alvo.getCodigo());

        System.out.println(excluido.toString());
    }
}
