package Lista7;

import java.util.Scanner;

public class questão5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int umidade;

        do {
            System.out.println("Digite a umidade do ambiente: ");
            umidade = sc.nextInt();

            if (umidade < 40){
                System.out.println("Ambiente inadequado, aumente a umidade!");
            }
            else {
                if (umidade > 60){
                    System.out.println("Ambiente indequado, abaixe a umidade");
                }
                else {
                    System.out.println("Ambiente adequado!");
                }
            }
        } while ( umidade < 40 || umidade > 60);
        sc.close();
    }
}
