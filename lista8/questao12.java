package lista8;

import java.util.Scanner;

public class questao12 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int defeitos = 0;
        String status;

        do {
            System.out.println("Digite o status da peça (OK ou DEFEITO): ");
            status = sc.nextLine();

            if (status.equalsIgnoreCase("DEFEITO")) {
                defeitos++;
                System.out.println("Total de defeitos: " + defeitos);
            }

        } while (defeitos < 5);

        System.out.println("Produção encerrada. Limite de defeitos atingido.");
        sc.close();

    }
}
