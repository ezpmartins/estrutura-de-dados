[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/f6LBCuwe)
# Exercício de ordenação com Tema 😁

## Orientações Gerais: 🚨

Faça a atividade com base no seu ``tema`` sorteado ⭐:

## Exercício 📎

1. Crie uma classe com 6 atributos (um atributo ID inteiro, pelo menos um atributo String, pelo
   menos um atributo Double, mais um atributo inteiro).
2. Crie objetos dessa classe e preencha um vetor de tamanho no mínimo 8.
3. Ordene os dados do vetor, usando como critério um **atributo diferente do ID**. (Implemente 2
   algoritmos de ordenação diferentes).
4. Caso queira se **desafiar**, implemente a ordenação em **ordem decrescente**, ao invés de
   crescente como foi feita em aula.

---

``⚠️Importante``: Teste os algoritmos de ordenação antes de submeter o exercício.

---
``💡Dica``: Se o atributo for **String**, utilize o método **compareTo**:

``` 
 str1.compareTo(str2)
```

| Condição    | Retorno do método |
|-------------|-------------------|
| str1 < str2 | valor < 0         |
| str1 = str2 | valor = 0         |
| str1 > str2 | valor > 0         |

Exemplo:

``` java
String str1 = "A";
String str2 = "B";
System.out.println(str1.compareTo(str2)); // -1
```