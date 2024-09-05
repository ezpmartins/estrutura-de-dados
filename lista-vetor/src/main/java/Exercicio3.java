import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] vetorDeNomes = new String[10];

        for (int i = 0; i < vetorDeNomes.length; i++) {
            System.out.println("Prencha um nome qualquer na posição: [" + i + "]: ");
            vetorDeNomes[i] = leitor.nextLine();
        }

        System.out.println("--------------------------");
        System.out.println("Pesquise por algum nome qualquer:");
        Boolean encontrado = false;
        String nomeEncontrado = leitor.nextLine();

        for (int i = 0; i < vetorDeNomes.length; i++) {
            if (nomeEncontrado.equalsIgnoreCase(vetorDeNomes[i])) {
                System.out.println("Nome encontrado no indice: [" + i + "] ");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Nome não encontrado");
        }
    }
}
