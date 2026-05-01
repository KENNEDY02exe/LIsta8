package lista8;

import java.util.Scanner;

public class questão11 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double consumo;
        double total = 0;

        do {
            System.out.print("Digite o consumo em kWh: ");
            consumo = sc.nextDouble();

            total = total + consumo;

            System.out.println("Total acumulado: " + total + " kWh");
            System.out.println("-----------------------------");

        } while (total < 500);

        System.out.println("Limite de 500 kWh atingido!");
        sc.close();
    }
}
