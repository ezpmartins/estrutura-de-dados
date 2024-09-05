[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/UDW6-bEp)
# 🎲 Exercício - Classe Abstrata ou Interface

### Observações:
- Desenhe o diagrama de classes do sistema abaixo e coloque um PRINT com o nome ```diagrama``` na pasta/diretório raiz do projeto Java
- A resposta das perguntas númeradas abaixo deve ser entregue no arquivo txt com nome ```respostas```, adicionado na pasta/diretório raiz do projeto
- Implemente o código somente após ter o diagrama de classes validado!

## Imagine o seguinte cenário:

- Uma escola tem vários funcionários.

- No final de cada ano, a escola paga um bônus sobre o salário apenas dos coordenadores e dos
professores. Os demais funcionários da escola não ganham esse bônus.

- Há uma regra na escola de que o coordenador não deve dar aula, e de que o professor não deve
coordenar.

### Pergunta 01) Se quisermos obrigar que a classe que representa o ```Professor``` e a classe que representa o ```Coordenador``` implementem o método: ```getValorBonus()``` qual seria a melhor forma: classe abstrata ou interface? Justifique

**Atenção:** As outras classes que representam funcionários que não recebem bônus não devem
ter esse método. Não é necessário representar no diagrama de classes nem implementar essas
outras classes. Também não há necessidade de representar nem implementar a classe Escola.

Considere as seguintes informações:
- Atributos de Professor: nome, quantidade de aulas por semana, valor da hora aula
- Atributos de Coordenador: nome, quantidade de horas de coordenação por semana, valor da
hora de coordenação
- Cálculo do bônus do Professor: quantidade de aulas por semana * valor da hora aula * 4.5 * 0.15
- Cálculo do bônus do Coordenador: quantidade de horas de coordenação por semana * valor da
hora de coordenação * 4.5 * 0.2

Implemente também a classe ```ControleBonus```, que terá como atributo um ou mais List para
conter todos os objetos que recebem bônus. Implemente na classe ```ControleBonus```:
- Método que adiciona o objeto ao(s) List
- Método que exibe o conteúdo do(s) List
- Método que calcula o total de bônus do(s) List

### Pergunta 02) É necessário ter 2 List ou apenas um na classe ```ControleBonus```? Justifique

### Pergunta 03) O polimorfismo está presente nesse sistema? Justifique.
 
Não se esqueça de implementar o construtor e o toString() nas diversas classes.

Implemente a classe que contém o main, e dentro do main, crie objetos Professor e
Coordenador, crie objeto da classe ControleBonus, e chame seus métodos.





