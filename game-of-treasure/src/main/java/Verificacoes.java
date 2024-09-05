import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.ThreadLocalRandom;

public class Verificacoes {


    public static Boolean encontrouTodosTesouros(String[] mapa) {

        for (int i = 0; i < mapa.length; i++) {
            if (mapa[i].equalsIgnoreCase("tesouro")) {
                return false;
            }
        }

        return true;
    }

    public static String[] renderizarMapa(String[] mapa) {


        String[] f = {"vazia", "tesouro", "armadilha"};

        for (int i = 0; i < mapa.length; i++) {

            int qtdTesouros = 0;
            String posicao = f[ThreadLocalRandom.current().nextInt(0, 3)];
            mapa[i] = posicao;
            if(posicao.equalsIgnoreCase("tesouro")){
                qtdTesouros++;
            }
        }

        return mapa;
    }

    public static Boolean casaEscolhida(String[] mapa, int index) {
        return mapa[index].equalsIgnoreCase("escolhida");
    }



}
