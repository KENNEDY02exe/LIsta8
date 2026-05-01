package lista8;

import java.util.Scanner;

public class questão19 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int totalPecas = 0;
        int boas = 0;
        int defeitos = 0;
        String status;

        do {
            System.out.print("Peça " + (totalPecas + 1) + " (OK ou DEFEITO): ");
            status = sc.nextLine();

            if (status.equalsIgnoreCase("OK")) {
                boas++;
            } else if (status.equalsIgnoreCase("DEFEITO")) {
                defeitos++;
            } else {
                System.out.println("Valor inválido! Digite OK ou DEFEITO.");
                continue; // não conta a peça inválida so uma obs
            }

            totalPecas++;

        } while (totalPecas < 50);

        double porcentagemPerda = (defeitos * 100.0) / totalPecas;

        System.out.println("RESULTADO ");
        System.out.println("Peças boas: " + boas);
        System.out.println("Refugos (defeitos): " + defeitos);
        System.out.println("Porcentagem de perda: " + porcentagemPerda + "%");

        sc.close();
    }
}
