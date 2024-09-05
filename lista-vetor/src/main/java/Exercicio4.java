import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] valoresInteiros = new int[10];

        for (int i = 0; i < valoresInteiros.length; i++) {
            System.out.println("Prencha os campos abaixo com valores inteiros na posição: [" + i + "]");
            valoresInteiros[i] = leitor.nextInt();
        }

        System.out.println("Digite um número para saber quantas vezes aparece no vetor:");
        int numeroPesquisado = leitor.nextInt();
        int contador = 0;
        for (int i = 0; i < valoresInteiros.length; i++) {
            if (numeroPesquisado == valoresInteiros[i]) {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("O número " + numeroPesquisado + " ocorre " + contador + " vez(es)");
        }
        else{
            System.out.println("O número " + numeroPesquisado + " não ocorre nenhuma vez.");

        }
    }
}
