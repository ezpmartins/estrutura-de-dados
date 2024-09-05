import java.security.PublicKey;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void selectionSort(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[i]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(vetor));
    }

    public static void selectionSortOtimizado(int[] vetor2) {
        for (int i = 0; i < vetor2.length; i++) {
            int indMenor = i;
            for (int j = i + 1; j < vetor2.length; j++) {
                if (vetor2[j] < vetor2[indMenor]) {
                    indMenor = j;
                }
            }
            int aux = vetor2[i];
            vetor2[i] = vetor2[indMenor];
            vetor2[indMenor] = aux;

        }
        System.out.println(Arrays.toString(vetor2));
    }

    public static void bubbleSort(int[] vetor3) {
        for (int i = 0; i < vetor3.length - 1; i++) {
            for (int j = 1; j < vetor3.length - i; j++) {
                if (vetor3[j - 1] > vetor3[j]) {
                    int aux = vetor3[j - 1];
                    vetor3[j - 1] = vetor3[j];
                    vetor3[j] = aux;
                }

            }
        }
        System.out.println(Arrays.toString(vetor3));
    }

    public static void insertionSort(int[] vetor4) {
        for (int i = 1; i < vetor4.length; i++) {
            int x = vetor4[i];
            int j = i - 1;
            while (j >= 0 && vetor4[j] > x) {
                vetor4[j + 1] = vetor4[j];
                j = j - 1;
            }
            vetor4[j + 1] = x;
        }
        System.out.println(Arrays.toString(vetor4));
    }

    public static void pesqBin(int[] vetor5, int x) {
        int indInf = 0;
        int indSup = vetor5.length - 1;
        while (indInf <= indSup) {
            int meio = (indInf + indSup) / 2;
            if (vetor5[meio] == x) {
                System.out.println(meio);
            } else if (x < vetor5[meio]) {
                indSup = meio - 1;
            } else {
                indInf = meio + 1;
            }
        }
        System.out.println(-1);
        ;
    }


    public static void main(String[] args) {

        int vetor[] = {10, 20, 30, 60, 1, 5, 100, 47, 15};
        int vetor2[] = {1, 15, 56, 70, 2, 5, 10, 47, 14};
        int vetor3[] = {7, 9, 3, 2, 1, 4, 5, 10};
        int vetor4[] = {15, 28, 92, 4, 3, 2, 19};
        int vetor5[] = {152, 21, 32, 4, 3, 5, 10};


        System.out.println("Vetor com Selection Sort:");
        selectionSort(vetor);
        System.out.println();
        System.out.println("Vetor com Selection Sort Otimizado:");
        selectionSortOtimizado(vetor2);
        System.out.println();
        System.out.println("Vetor com Bubble Sort:");
        bubbleSort(vetor3);
        System.out.println();
        System.out.println("Vetor com Insertion Sort:");
        insertionSort(vetor4);
        System.out.println();
        System.out.println("Vetor com pesquisa binária:");
        pesqBin(vetor5, 2);
        System.out.println();
    }
}
