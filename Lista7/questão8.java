package Lista7;

import java.util.Scanner;

public class questão8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int botao;

        do {
            System.out.println("Digite um botão, (0 para OK, 1 para EMERGÊNCIA): ");
            botao = sc.nextInt();

            if (botao == 0){
                System.out.println("Opereção Normal");
            }
        } while (botao != 1);
        sc.close();
    }
}
