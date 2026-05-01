package Lista7;

import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String status;
        int total;
        total = 0;
        do {
            System.out.print("Estado da peça (OK/DEFEITO): ");
            status = sc.nextLine().trim().toUpperCase();
            if (status.equals("DEFEITO")) {
                total = total + 1;
                System.out.println("Defeito registrado! Total: " + total + "/5");


            } else if (status.equals("OK")) {
                System.out.println("Peça aprovada.");


            } else {
                System.out.println("Entrada inválida. Use OK ou DEFEITO.");
            }
        } while (total < 5);

        System.out.println(" ALERTA ");
        System.out.println("Produção interrompida: Limite de 5 defeitos atingido.");
        sc.close();


    }
}