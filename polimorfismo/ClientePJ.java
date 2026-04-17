package polimorfismo;

public class ClientePJ extends Cliente{
    private String cnpj;


    public ClientePJ(String nome, String documento){
        super(nome,documento);
        this.cnpj = "00000-0001/0";
    }
}
