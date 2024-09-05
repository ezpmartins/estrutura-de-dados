package school.sptech;

import java.util.Arrays;

public class Empresa {
    private int id;
    private String nome;
    private String setor;
    private double receitaAnual;
    private int numeroFuncionarios;
    private int anoFundacao;

    public Empresa(int id, String nome, String setor, double receitaAnual, int numeroFuncionarios, int anoFundacao) {
        this.id = id;
        this.nome = nome;
        this.setor = setor;
        this.receitaAnual = receitaAnual;
        this.numeroFuncionarios = numeroFuncionarios;
        this.anoFundacao = anoFundacao;
    }

    public Empresa() {
        //
    }

    public static void selectionSortNumeroFunc(Empresa[] empresas) {
        for (int i = 0; i < empresas.length; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < empresas.length; j++) {
                if (empresas[j].getNumeroFuncionarios() < empresas[indiceMenor].getNumeroFuncionarios()) {
                    indiceMenor = j;
                }
            }
            Empresa aux = empresas[indiceMenor];
            empresas[indiceMenor] = empresas[i];
            empresas[i] = aux;

        }
        System.out.println(Arrays.toString(empresas));
    }

    public static void selectionSortAnoFundacao(Empresa[] empresas) {
        for (int i = 0; i < empresas.length; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < empresas.length; j++) {
                if (empresas[j].getAnoFundacao() < empresas[indiceMenor].getAnoFundacao()) {
                    indiceMenor = j;
                }
            }
            Empresa aux = empresas[indiceMenor];
            empresas[indiceMenor] = empresas[i];
            empresas[i] = aux;
        }
        System.out.println(Arrays.toString(empresas));
    }

    public static void selectionSortReceitaAnualDecrescente(Empresa[] empresas) {
        for (int i = 0; i < empresas.length; i++) {
            int indiceMaior = i;
            for (int j = i + 1; j < empresas.length; j++) {
                if (empresas[j].getReceitaAnual() > empresas[indiceMaior].getReceitaAnual()) {
                    indiceMaior = j;
                }
            }
            Empresa aux = empresas[indiceMaior];
            empresas[indiceMaior] = empresas[i];
            empresas[i] = aux;
        }
        System.out.println(Arrays.toString(empresas));
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getReceitaAnual() {
        return receitaAnual;
    }

    public void setReceitaAnual(double receitaAnual) {
        this.receitaAnual = receitaAnual;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }
    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", setor='" + setor + '\'' +
                ", receitaAnual=" + receitaAnual +
                ", numeroFuncionarios=" + numeroFuncionarios +
                ", anoFundacao=" + anoFundacao +
                '}';
    }
}

