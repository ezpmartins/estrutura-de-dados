package school.sptech;

public class Coordenador extends Funcionario implements IBonus {
    private Integer qtdHorasCoordenacao;
    private Double valorHoraCoordenacao;

    public Coordenador(String nome, Double salario, Integer qtdHorasCoordenacao, Double valorHoraCoordenacao) {
        super(nome, salario);
        this.qtdHorasCoordenacao = qtdHorasCoordenacao;
        this.valorHoraCoordenacao = valorHoraCoordenacao;
    }

    public Coordenador() {
        //vazio
    }

    @Override
    public Double getValorBonus() {
        return qtdHorasCoordenacao * valorHoraCoordenacao * 4.5 * 0.2;
    }

    public Integer getQtdHorasCoordenacao() {
        return qtdHorasCoordenacao;
    }

    public void setQtdHorasCoordenacao(Integer qtdHorasCoordenacao) {
        this.qtdHorasCoordenacao = qtdHorasCoordenacao;
    }

    public Double getValorHoraCoordenacao() {
        return valorHoraCoordenacao;
    }

    public void setValorHoraCoordenacao(Double valorHoraCoordenacao) {
        this.valorHoraCoordenacao = valorHoraCoordenacao;
    }
}
