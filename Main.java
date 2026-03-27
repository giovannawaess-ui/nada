import models.ContaBancaria;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer opcoes;
        Boolean parada = true;

        ContaBancaria conta = new ContaBancaria(0.0);

        while (parada){
            System.out.println("Digite um valor(APENAS NUMEROS):");
            opcoes = Integer.parseInt(scan.nextLine());

            switch (opcoes){
                case 1:
                    conta.despositar(scan.nextFloat());
                    break;
            }
        }

    }
}