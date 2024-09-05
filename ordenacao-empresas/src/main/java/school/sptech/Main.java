package school.sptech;

import java.util.Arrays;
import java.util.List;

public class Main extends Empresa {

    public static void main(String[] args) {

        Empresa[] empresas = new Empresa[8];
        empresas[0] = new Empresa(1, "SEK", "Tecnologia", 5000000.00, 150, 2000);
        empresas[1] = new Empresa(2, "Elera", "Saúde", 8000000.00, 200, 1995);
        empresas[2] = new Empresa(3, "SPTECH", "Educação", 3000000.00, 80, 2010);
        empresas[3] = new Empresa(4, "JAZZ-TECH", "Financeiro", 323.000, 300, 1990);
        empresas[4] = new Empresa(5, "C&A", "Varejo", 4000000.00, 120, 2005);
        empresas[5] = new Empresa(6, "Rappi", "Tecnologia", 6000000.00, 170, 2002);
        empresas[6] = new Empresa(7, "SPtrans", "Transporte", 2000000.00, 60, 2015);
        empresas[7] = new Empresa(8, "Swile", "Alimentação", 9000000.00, 250, 1998);

        System.out.println("Selection Sort Número de Funcionários: ");
        selectionSortNumeroFunc(empresas);
        System.out.println("Selection Sort Ano de Fundação: ");
        selectionSortAnoFundacao(empresas);
        System.out.println("Selection Sort em ordem decrescente Receita: ");
        selectionSortReceitaAnualDecrescente(empresas);





    }


}