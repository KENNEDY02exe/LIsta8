package Lista7;

import java.util.Scanner;

public class questão10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int peca,cont = 0, soma = 0;
        double media;

        do {
            cont = cont + 1;
            System.out.println("Digite a quantidade de peças produzidas no "+cont+ "° turno: ");
            peca = sc.nextInt();
            soma = soma + peca;
        }while (cont != 5);
        sc.close();

        media = soma / 5;

        System.out.println("Média das peças produzidas no 5 turnos: "+media);
    }
}
