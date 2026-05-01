package Lista7;

import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maquina = 1;
        double tempoLigada, tempoProduzindo, disponibilidade;

        do {
            System.out.println("Configuração da máquina " +maquina);
            System.out.print("Tempo total de máquina ligada (horas): ");
            tempoLigada = sc.nextInt();
            System.out.print("Tempo total de máquina produzindo (horas): ");
            tempoProduzindo = sc.nextInt();
            maquina = maquina + 1;
            disponibilidade = tempoProduzindo / tempoLigada;
            System.out.println("Disponibilidade da máquina: "+disponibilidade);
        }while (maquina != 3);
    }
}
