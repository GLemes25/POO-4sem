package br.com.biblioteca.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.biblioteca.dominio.Colecao;
import br.com.biblioteca.servico.ColecaoServico;

public class ColecaoTeste extends BaseTeste<Colecao> {

    public ColecaoTeste() {
        this.servico = new ColecaoServico();
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

        Colecao Colecao = new Colecao(4, "Coleção 4", LocalDate.now(), "Editora 4");
        Colecao novo = this.servico.Criar(Colecao);
        System.out.println(novo.toString());
        return novo.getCodigo();
    }

    @Override
    protected void TestarLeitura(int Cod) {
        System.out.println("\nTestarLeitura");

        Colecao Colecao = this.servico.Ler(Cod);
        System.out.println(Colecao.toString());

    }

    @Override
    protected void TestarLeituras() {
        System.out.println("\nTestarLeituras");

        List<Colecao> lista = this.servico.Ler();

        for (Colecao Colecao : lista) {
            System.out.println(Colecao.toString());
        }
    }

    @Override
    protected void TestarAlteracao(int Cod) {
        System.out.println("\nTestarAlteracao");
        Colecao antigo = this.servico.Ler(Cod);
        antigo.setEditora("EditoraAlterado");

        Colecao alterada = this.servico.Atualizar(antigo);

        System.out.println(alterada.toString());
    }

    @Override
    protected void TestarExclusao(int Cod) {
        System.out.println("\nTestarExclusao");

        Colecao alvo = this.servico.Ler(Cod);

        Colecao excluido = this.servico.Delete(alvo.getCodigo());

        System.out.println(excluido.toString());
    }
}
