package edu.wellinton.desafio.Dia1;
/*
DIA 2/100
Desenvolva um algoritmo que verifique se um número é um quadrado perfeito e retorne se é verdadeiro ou falso.
Regra adicional: faça esse número ser gerado aleatoriamente, mas o converta para o inteiro mais próximo.

Regra adicional 2: Pode ser usada qualquer linguagem para cumprir o desafio, porém não é permitida nenhum busca de códigos além da documentação oficial.
 */
public class $002 {
    public static void main(String[] args) {
        calcularQuadradoPerfeito();
    }
    public static void calcularQuadradoPerfeito(){
        int num = (int) (Math.random() * 100) + 1; //Gera um número pseudoaleatório de 1 a 100 e o converte para o inteiro mais próximo.
        double res = Math.sqrt(num); //Pega o número gerado e retorna a raíz quadrada.

        if(res % 2 == 0){ //Checa o resto da divisão, caso seja 0 isso indica que não houve sobra na divisão, e 1 é por que houve sobra na divisão e por isto não é um quadrado perfeito.
            System.out.println(STR."O número \{num} é um quadrado perfeito!");
        } else {
            System.out.println(STR."O número \{num} não é um quadrado perfeito ;(");
        }

    }
}
