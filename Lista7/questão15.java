package bloco4;

import java.util.Scanner;

public class questão15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 1, horas, soma = 0;

        do {
            System.out.println("Digite número de horas de utilização do drone na "+cont+ "° missão: ");
            horas = sc.nextInt();
            cont = cont + 1;
            soma = soma + horas;
            System.out.println("Número de horas utilizado: "+horas);
        } while (soma < 20);
        sc.close();

        System.out.println("Limite de 20 horas atingido");
    }
}
