package bloco4;

import java.util.Scanner;

public class questão17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia;

        do {
            System.out.println("Digite o dia da última manuntenção: ");
            dia = sc.nextInt();
            if (dia < 1 || dia > 31){
                System.out.println("Dia inválido");
            }
        } while (dia < 1 || dia > 31);
        sc.close();
    }
}
