package polimorfismo;

public class Cliente {
    private String nome;
    private String documento;

    public Cliente (String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    
    public void steNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }


    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getDocumento() {
        return this.documento;
    }


    public Cliente buscarCliente(String documento){
        return this;
    }
}
