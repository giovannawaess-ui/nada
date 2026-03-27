import models.Cachorro;
import models.Pessoa;

public class Exe {
    public static void main(String[]args){

        Cachorro cachorro = new Cachorro("tob", "branco");
        Cachorro cachorro2 = new Cachorro("jeferson", "rosa");
        Cachorro cachorro3 = new Cachorro("cind", "cinza");

        Pessoa pessoa = new Pessoa("Adryann", "xxx-xxx-xx", 17);

        pessoa.getCachorro().add(cachorro2);
        pessoa.getCachorro().add(cachorro3);
        pessoa.getCachorro().add(cachorro);

        System.out.println("Teste isEmpty");
        System.out.println(pessoa.getCachorro().isEmpty());
        System.out.println(pessoa.getCachorro().size());

        for (Cachorro c: pessoa.getCachorro()) {
            System.out.println(c.getNome());
        }

    }
}
