package br.com.biblioteca.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.biblioteca.dominio.Autor;
import br.com.biblioteca.servico.AutorServico;

public class AutorTeste extends BaseTeste<Autor> {

    public AutorTeste() {
        this.servico = new AutorServico();
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

        Autor Autor = new Autor(0, "Autor 4", LocalDate.now(), "Nome 4", "sobrenome 4");
        Autor novo = this.servico.Criar(Autor);
        System.out.println(novo.toString());
        return novo.getCodigo();
    }

    @Override
    protected void TestarLeitura(int Cod) {
        System.out.println("\nTestarLeitura");

        Autor Autor = this.servico.Ler(Cod);
        System.out.println(Autor.toString());

    }

    @Override
    protected void TestarLeituras() {
        System.out.println("\nTestarLeituras");

        List<Autor> lista = this.servico.Ler();

        for (Autor Autor : lista) {
            System.out.println(Autor.toString());
        }
    }

    @Override
    protected void TestarAlteracao(int Cod) {
        System.out.println("\nTestarAlteracao");
        Autor antigo = this.servico.Ler(Cod);
        antigo.setNome("NomeAlterado");

        Autor alterada = this.servico.Atualizar(antigo);

        System.out.println(alterada.toString());
    }

    @Override
    protected void TestarExclusao(int Cod) {
        System.out.println("\nTestarExclusao");

        Autor alvo = this.servico.Ler(Cod);

        Autor excluido = this.servico.Delete(alvo.getCodigo());

        System.out.println(excluido.toString());
    }
}
