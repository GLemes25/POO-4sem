import java.time.LocalDate;

import br.com.wholesale.domain.*;

public class App {
    public static void main(String[] args) throws Exception {

        PhysicalPerson pf1 = new PhysicalPerson(1, "Matheus", "matheus@ceu.com.br", "ceu.com.br", LocalDate.now(),
                "123",
                "123", "m", "negro", "hebreu", "jerusalem", "pai do matheus", "mae do matheus");

        LegalPerson pj1 = new LegalPerson(2, "akime", "@acme.com.br", "www.acme.com", LocalDate.now(), "054212",
                "455412", "748", "piupiu e frajola Bar e Lanches");

        System.out.println("\n=======================================================================\n");
        System.out.println(pf1.toString());
        System.out.println("\n=======================================================================\n");
        System.out.println(pj1.toString());

    }
}
