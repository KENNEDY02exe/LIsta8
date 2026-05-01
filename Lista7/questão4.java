package Lista7;

import java.util.Scanner;

public class questão4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tanque;

        do {
            System.out.println("Digite nível do tanque: ");
            tanque = sc.nextInt();

            if (tanque < 80){
                System.out.println("Enchendo...");
            }
        } while (tanque < 80);
        sc.close();
    }
}
