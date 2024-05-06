package edu.wellinton.desafio.Dia1;
/*
Exercicio envolvendo matriz quadrada , retirado do HackerRank
https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=false
 */
public class $008 {
    public static void main(String[] args) {
        int[] array =
                {11,2,4,
                 4,5,6,
                 10,8,-12};

        System.out.println(diagonalDifference(array));
    }

    public static int diagonalDifference(int[] array){

        int resultado = array[0] + array[4] + array[8];
        int resultado2 = array[2] + array[4] + array[6];
        int resultadoFinal;

        if (resultado > resultado2){
            resultadoFinal = resultado - resultado2;
        } else if(resultado < resultado2){
            resultadoFinal = resultado2 - resultado;
        } else {
            resultadoFinal = resultado - resultado2;
        }

       return resultadoFinal;
    }
}
