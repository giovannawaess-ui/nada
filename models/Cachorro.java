package models;

public class Cachorro {
    private String nome;
    private Integer idade;
    private String cor;
    private String som;
    private String raca;
    private Double peso;

    public Cachorro(String nome, Integer idade, String cor, String som){
      this.nome = nome;
      this.idade = idade;
      this.cor = cor;
      this.som = som;
   }

   public Cachorro(String nome, String cor){
      this.nome = nome;
      this.cor = cor;
   }

   
   public void setNome(String nome) {
        this.nome = nome;
   }

   public String getNome() {
        return this.nome;
   }

   public void emitirSom(){
        this.som = "AU AU INFO25!";
        System.out.println(this.som);
   }

   public void setIdade(Integer idade) {
        this.idade = idade;
   }

   public Integer getIdade() {
        return this.idade;
   }

   public void setCor(String cor) {
        this.cor = cor;
   }

   public String getCor() {
        return this.cor;
   }

   public void setSom(String som) {
        this.som = som;
   }

   public String getSom() {
        return this.som;
   }

   public void setRaca(String raca) {
        this.raca = raca;
   }

   public String getRaca() {
        return this.raca;
   }

   public void setPeso(Double peso) {
        this.peso = peso;
   }

   public Double getPeso() {
        return this.peso;
   }

   public String toString() {
   return"nome : "+ this.nome + "\n" + "Cor: " + this.cor;
   }
}
