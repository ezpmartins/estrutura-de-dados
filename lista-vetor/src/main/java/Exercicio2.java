import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int vetor[] = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Preencha o vetor na posição[" + i + "]: ");
            vetor[i] = leitor.nextInt();

        }
        int soma = 0;
        double media = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
            media = soma / vetor.length;
        }
        System.out.println("A média dos números no vetor é: " + media);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                System.out.println("Numéros acima da média são: " + vetor[i]);
            }
            
        }
    }

}
