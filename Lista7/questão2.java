package Lista7;

import java.util.Scanner;

public class questão2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pressao;

        do {
            System.out.println("Digite a pressão em bar: ");
            pressao = sc.nextDouble();

            if (pressao < 10){
                System.out.println("Digite novamente!");
            }
        } while (pressao < 10);
        sc.close();
    }
}
