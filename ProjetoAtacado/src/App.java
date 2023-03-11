import java.time.LocalDate;

import br.com.atacado.dominio.*;

public class App {
    public static void main(String[] args) throws Exception {

        PessoaFisica p1 = new PessoaFisica(1, "Matheus", "matheus@ceu.com.br", "ceu.com.br", LocalDate.now(), "123",
                "123", "m", "negro", "hebreu", "jerusalem", "pai do matheus", "mae do matheus");

        PessoaJuridica pj1 = new PessoaJuridica(2, "akime", "@acme.com.br", "www.acme.com", LocalDate.now(), "054212",
                "455412", "748", "piupiu e frajola Bar e Lanches");

    }
}
