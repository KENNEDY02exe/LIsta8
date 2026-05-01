package Lista7;

import java.util.Scanner;

public class questão11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total, consumo;
        total = 0;

        do {
            System.out.println("Insira o consumo da máquina em kWh: ");
            consumo = sc.nextInt();
            total = total + consumo;
            System.out.println("total acumulado: " + total + "KWh");

        } while (total < 500);
        System.out.println("Limite de 500 kWh atingido!");


    }
}


