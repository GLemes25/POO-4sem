
import br.com.biblioteca.teste.AutorTeste;
import br.com.biblioteca.teste.ColecaoTeste;
import br.com.biblioteca.teste.LivroTeste;

public class App {
    public static void main(String[] args) {

        AutorTeste AutorTeste = new AutorTeste();
        System.out.println("\n\t AUTOR");
        AutorTeste.Executar();

        LivroTeste LivroTeste = new LivroTeste();
        System.out.println("\n\t COLEÇAO");
        LivroTeste.Executar();

        ColecaoTeste ColecaoTeste = new ColecaoTeste();
        System.out.println("\n\t LIVRO");
        ColecaoTeste.Executar();
    }
}
