package lista8;

import java.util.Scanner;

public class questão10 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        int pecas;
        int soma = 0;

        do {
            System.out.print("Digite a quantidade de peças do turno " + contador + ": ");
            pecas = sc.nextInt();

            soma = soma + pecas;

            contador++;

        } while (contador <= 5);

        double media = soma / 5.0;

        System.out.println("Média de peças produzidas: " + media);

        sc.close();
    }
}
