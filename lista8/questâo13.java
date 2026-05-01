package lista8;

import java.util.Scanner;

public class questâo13 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int maquina = 1;

        while (maquina <= 3) {
            System.out.println("Máquina " + maquina);

            System.out.print("Digite o tempo total ligada: ");
            double tempoTotal = sc.nextDouble();

            System.out.print("Digite o tempo produzindo: ");
            double tempoProducao = sc.nextDouble();

            double disponibilidade = tempoProducao / tempoTotal;

            System.out.println("Disponibilidade (OEE): " + disponibilidade);
            System.out.println("-----------------------------");

            maquina++;
        }

        sc.close();
    }
}


