package polimorfismo;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        System.out.println("Polimorfismo");

        Banco bancoIF = new Banco();

        bancoIF.clientes = new ArrayList<>();

        ClientePF clientePf = new ClientePF("joão", "123.123.123.09-0");
        ClientePJ clientePj = new ClientePJ("Enterprise-IF", "123456.0001/0");

        bancoIF.clientes.add(clientePf);
        bancoIF.clientes.add(clientePj);

        System.out.println(bancoIF.clientes);

        //System.out.println(clientePf instancof Banco);
    }
}