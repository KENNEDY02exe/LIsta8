package lista8;

import java.util.Scanner;

public class questão18 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int rpm = 0;

        do {
            rpm = rpm + 500;

            System.out.println("Rotação atual: " + rpm + " RPM");

        } while (rpm < 3000);

        System.out.println("Rotação máxima atingida!");

    }
}


