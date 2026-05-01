package bloco4;

import java.util.Scanner;

public class questão16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int materiaPrima = 100, quantidade = 0, estoque = 100;

        do {
            System.out.println("Estoque: " + materiaPrima);
            System.out.println("Digite a quantidade usada: ");
            quantidade = sc.nextInt();

            if (quantidade > estoque) {
                System.out.println("Quantidade maior que o estoque, digite novamente: ");
                quantidade = sc.nextInt();
                materiaPrima = materiaPrima - quantidade;
                estoque = materiaPrima;
            }
            else {
                materiaPrima = materiaPrima - quantidade;
                estoque = materiaPrima;
            }
        } while (materiaPrima > 10);
        sc.close();

        System.out.println("Limite atingido");
    }
}
