package school.sptech;

public class Main {

  public static void main(String[] args) {
    Professor professor1 = new Professor();
    Coordenador coordenador1 = new Coordenador();
    ControleBonus controle = new ControleBonus();



   controle.addFuncionario(professor1);
   controle.addFuncionario(coordenador1);

   controle.exibirFuncionario();

    System.out.println(controle.calcularTotalBonus());

  }
}