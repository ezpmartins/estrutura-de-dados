import java.util.Scanner;

public class ExemploVetor {
    public static void exibeVetorDeInteiros(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    public static void main(String[] args) {
        // Vetor de Strings:
        String[] palavras = new String[50];

        //Vetor com valores iniciais:
        int[] vetorComValores = {10, 20, 30, 40};

        // Vetor de Inteiros:
        int[] vetor = new int[5];
        vetor[0] = 10;
        vetor[1] = 20;


        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        Scanner leitor = new Scanner(System.in);
        int[] vetorUsuario = new int[7];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Preencha o vetor[" + i + "]");
            vetorUsuario[i] = leitor.nextInt();
        }
        exibeVetorDeInteiros(vetorUsuario);
        String palavra = "Teste";
        System.out.println("A palavra é: " + palavra);
    }
}
