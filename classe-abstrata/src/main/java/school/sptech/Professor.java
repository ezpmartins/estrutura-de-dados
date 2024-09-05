package school.sptech;

public class Professor extends Funcionario implements IBonus {
    private Integer qtdAulasSemana;
    private Double valorHoraAula;

    public Professor(String nome, Integer qtdAulasSemana, Double valorHoraAula) {
        super(nome);
        this.qtdAulasSemana = qtdAulasSemana;
        this.valorHoraAula = valorHoraAula;
    }

    public Professor() {
        //vazio
    }

    @Override
    public Double getValorBonus() {
        return qtdAulasSemana * valorHoraAula * 4.5 * 0.15;
    }

    public Integer getQtdAulasSemana() {
        return qtdAulasSemana;
    }

    public void setQtdAulasSemana(Integer qtdAulasSemana) {
        this.qtdAulasSemana = qtdAulasSemana;
    }

    public Double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }
}
