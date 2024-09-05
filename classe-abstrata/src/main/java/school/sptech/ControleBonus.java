package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    private List<IBonus> bonificacao;


    public void addFuncionario(IBonus bonus) {
        bonificacao.add(bonus);
    }

    public void exibirFuncionario() {
        for (IBonus bonus : bonificacao) {
            System.out.println(bonificacao);
        }
    }

    public Double calcularTotalBonus() {
        Double soma = 0.0;
        for (IBonus bonus : bonificacao) {
            soma += bonus.getValorBonus();
        }
        return soma;
    }
}

