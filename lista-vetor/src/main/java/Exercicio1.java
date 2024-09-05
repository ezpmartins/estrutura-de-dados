import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int vetor[] = new int[7];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Preencha o vetor na posição[" + i + "]: ");
            vetor[i] = leitor.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(" Valores na ordem digitada: " + vetor[i]);
        }
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(" Valores ao contrário: " + vetor[i]);
        }

    }
}
