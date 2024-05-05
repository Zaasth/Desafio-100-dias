package edu.wellinton.desafio.Dia1;
import java.util.ArrayList;
import java.util.List;

/*
Dia: 07/100
https://www.hackerrank.com/challenges/a-very-big-sum/problem?isFullScreen=true
 */

public class $007 {
    public static void main(String[] args) {

        List<Long> lista = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            long random1 = (long) (Math.random() * 999999999) + 100000000;
            lista.add(random1);
        }
        aVeryBigSum(lista);
    }

    public static void aVeryBigSum(List<Long> lista) {
        long soma =  lista.stream().mapToLong(Number::intValue).sum();
        System.out.println("Soma dos elementos da lista: " + soma);
    }
}
