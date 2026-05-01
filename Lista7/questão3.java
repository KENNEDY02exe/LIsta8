package Lista7;

import java.util.Scanner;

public class questão3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;

        do {
            total = total + 1;
            System.out.println(total);
        } while (total != 50);
        System.out.println("Contagem de peças realizada!");
    }
}
