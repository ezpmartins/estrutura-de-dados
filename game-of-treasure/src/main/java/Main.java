import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        System.out.println("""
                ""\"
                +==================================================================+
                | ██████╗  █████╗ ███╗   ███╗███████╗     ██████╗ ███████╗         |
                |██╔════╝ ██╔══██╗████╗ ████║██╔════╝    ██╔═══██╗██╔════╝         |
                |██║  ███╗███████║██╔████╔██║█████╗      ██║   ██║█████╗           |
                |██║   ██║██╔══██║██║╚██╔╝██║██╔══╝      ██║   ██║██╔══╝           |
                |╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗    ╚██████╔╝██║              |
                | ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝     ╚═════╝ ╚═╝              |
                |                                                                  |
                |████████╗██████╗ ███████╗ █████╗ ███████╗██╗   ██╗██████╗ ███████╗|
                |╚══██╔══╝██╔══██╗██╔════╝██╔══██╗██╔════╝██║   ██║██╔══██╗██╔════╝|
                |   ██║   ██████╔╝█████╗  ███████║███████╗██║   ██║██████╔╝█████╗  |
                |   ██║   ██╔══██╗██╔══╝  ██╔══██║╚════██║██║   ██║██╔══██╗██╔══╝  |
                |   ██║   ██║  ██║███████╗██║  ██║███████║╚██████╔╝██║  ██║███████╗|
                |   ╚═╝   ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚══════╝ ╚═════╝ ╚═╝  ╚═╝╚══════╝|
                +==================================================================+
                ""\"                                                                                                                                                                               \s
                                                                                                                                                                                                                                          \s
                          1 - Digite para jogar:                                                                                                                                                                                                               \s
                          2 - Digite para Sair:                                                                                                                                                                                                             \s
                          3 - Digite para Reiniciar:
                   
                """);

        Scanner scanner2 = new Scanner(System.in);

        int option = scanner2.nextInt();

        switch (option) {
            case 1:
//                Verificacoes.jogar();
                break;

            default:
                break;
        }
    }}