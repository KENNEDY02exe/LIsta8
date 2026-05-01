package Lista7;

import java.util.Scanner;

public class questão9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cracha;

        do {
            System.out.println("Digite seu cracha");
            cracha = sc.nextLine();

            if (cracha.startsWith("SENAI-")){
                System.out.println("Acesso liberado");
            }
        } while (!cracha.startsWith("SENAI-"));
        sc.close();

    }
}
