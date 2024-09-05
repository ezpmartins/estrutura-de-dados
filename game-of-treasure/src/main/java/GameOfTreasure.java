import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GameOfTreasure {

    public static Boolean encontrouTodosTesouros(String[] mapa) {
        for (String s : mapa) {
            if (s.equalsIgnoreCase("tesouro")) {
                return false;
            }
        }
        return true;
    }

    public static String[] renderizarMapa(String[] mapa) {
        String[] elementos = {"vazia", "tesouro", "armadilha"};
        for (int i = 0; i < mapa.length; i++) {
            mapa[i] = elementos[ThreadLocalRandom.current().nextInt(0, 3)];
        }
        return mapa;
    }

    public static Boolean casaEscolhida(String[] mapa, int index) {
        return mapa[index].equalsIgnoreCase("escolhida");
    }

    public static void jogar() {
        Scanner scanner = new Scanner(System.in);

        int tamanho = ThreadLocalRandom.current().nextInt(3, 11);
        String[] mapaVazio = new String[tamanho];
        int[] ranking = new int[3];
        boolean terminou = false;

        String[] mapa = GameOfTreasure.renderizarMapa(mapaVazio);

        System.out.println("\nBem-vindo ao jogo de caça ao tesouro!");
        System.out.println("=====================================");
        System.out.println("=====================================\n");

        for (int j = 1; j <= 3; j++) {
            int pontos = 0;

            if (!terminou) {
                System.out.println("\n--- Rodada número: " + j + " ---\n");

                for (int i = 0; i < mapa.length; i++) {
                    System.out.print("Escolha uma posição para escavar de 0 a " + (mapa.length - 1) + ": ");
                    int escolha = scanner.nextInt();

                    if(escolha < 0 || escolha >= mapa.length) {
                        System.out.println("opção fora do mapa, tente novamente");
                        continue;
                    }

                    if (GameOfTreasure.casaEscolhida(mapa, escolha)) {
                        System.out.println("⚠️ Posição já escolhida! Tente novamente.");
                        i--; // permite ao jogador escolher novamente
                        continue;
                    }


                    if (mapa[escolha].equalsIgnoreCase("tesouro")) {
                        System.out.println("🎉 Parabéns! Você encontrou um tesouro! +100 pontos");
                        pontos += 100;
                        mapa[escolha] = "escolhida";
                    } else if (mapa[escolha].equalsIgnoreCase("vazia")) {
                        System.out.println("🔍 Nada encontrado aqui.");
                        mapa[escolha] = "escolhida";
                    } else {
                        System.out.println("💥 Você encontrou uma armadilha! Você fez " + pontos + " pontos. Fim da rodada.");
                        ranking[j - 1] = pontos;
                        mapa[escolha] = "escolhida";
                        break;
                    }

                    if (GameOfTreasure.encontrouTodosTesouros(mapa)) {
                        System.out.println("\n🏆 Todos os tesouros foram encontrados! Você fez " + pontos + " pontos. Jogo encerrado.");
                        terminou = true;
                        ranking[j - 1] = pontos;
                        break;
                    }
                }
            }
        }

        System.out.println("\n==================");
        System.out.println("🏁 Resultado Final:");
        System.out.println("==================");
        System.out.println("Jogador 1: " + ranking[0] + " pontos");
        System.out.println("Jogador 2: " + ranking[1] + " pontos");
        System.out.println("Jogador 3: " + ranking[2] + " pontos");
        System.out.println("==================\n");

        System.out.println("Obrigado por jogar!");
    }

    public static void main(String[] args) {
        jogar();
    }
}
