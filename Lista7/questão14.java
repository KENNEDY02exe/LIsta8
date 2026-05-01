package bloco4;

import java.util.Scanner;

public class questão14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso, soma= 0;

        do {
            System.out.println("insira o peso das caixas em Kg:");
            peso = sc.nextDouble();
            soma = soma + peso;
            System.out.println("Peso total: " +soma+ "kg");
        } while (soma < 1000);
        sc.close();

        System.out.println("Limite de 1000Kg atingido");
    }
}
