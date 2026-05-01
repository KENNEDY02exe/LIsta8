package Lista7;

import java.util.Scanner;

public class questão6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario;

        do {
            System.out.println("Digite o nome do usuário: ");
            usuario = sc.nextLine();

            if (!usuario.equals("ADMIN")) {
                System.out.println("Usuário inválido, tente novamente!");
            }
            else {
                System.out.println("Acesso permitido");
            }
        } while (!usuario.equals("ADMIN"));
        sc.close();
    }
}
