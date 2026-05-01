package Lista7;

import java.util.Scanner;

public class questão1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temperatura;

        do {
            System.out.println("digite a temperatura");
            temperatura = sc.nextInt();
        } while (temperatura < 180);
        sc.close();

    }
}
