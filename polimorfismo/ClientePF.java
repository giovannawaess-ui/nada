package polimorfismo;

public class ClientePF extends Cliente {
    private String cpf;

    public ClientePF(String nome, String documento) {
        super(nome, documento);
        this.cpf = "0.0.0.0-3";
    }
}
