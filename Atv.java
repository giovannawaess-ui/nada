import java.util.Scanner;
import java.util.Random;

public class Atv {
    public static void main(String[] args) {

        int numeroadivinhado = 0, tentativa = 0;
        Scanner scan = new Scanner(System.in);
        Random randomizador = new Random();
        int numeroRandomizado = randomizador.nextInt(101);
        ;
        while (numeroadivinhado != numeroRandomizado) {
            System.out.println("Digite um numero: ");
            numeroadivinhado = scan.nextInt();
            if (numeroadivinhado != numeroRandomizado) {
                tentativa++;
                if (numeroadivinhado < numeroRandomizado) {
                    System.out.println("Palpite menor, tentativa: " + tentativa);
                } else {
                    System.out.println("Palpite maior, tentativa: " + tentativa);
                }

            } else {
                System.out.println("Acertou!!! ");
            }
        }
    }
}