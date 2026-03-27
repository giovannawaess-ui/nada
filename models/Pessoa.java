package models;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
     private String nome;
     private String cpf;
     private int idade;
     private List<Cachrros> cachorro;

     public Pessoa(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.cachorros = new ArrayList<>();
     }

        public List<Cachrros> getCachorro() {
            return cachorros;
        }
     
}
