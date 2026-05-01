package Lista7;

import java.util.Scanner;

public class questão7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha;

        do {
            System.out.println("Digite a senha: ");
            senha = sc.nextInt();

            if (senha != 1234){
                System.out.println("Senha incorreta, tente novamente!");
            }
            else {
                System.out.println("Senha correta!");
            }
        } while (senha != 1234);
        sc.close();

    }
}
