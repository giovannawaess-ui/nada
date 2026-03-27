package models;

public class ContaBancaria{

    /*Agência
    Número da conta
    Nome
    Saldo inicial*/

    private String agencia;
    private Integer numeroConta;
    private String nomeCliente;
    private Float saldoInicial;
    private Integer controleDeposito = 0;

    public void depositar(Float valor){

        if (valor < 5) 
            return;
       
        if(controleDeposito >= 5) {
        this.saldoInicial += (float) +2.99;
    }
        

        
    }

}