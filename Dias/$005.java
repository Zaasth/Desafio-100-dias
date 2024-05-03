package edu.wellinton.desafio.Dia1;
//Link do desafio: https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true
public class $005 {
    public static void main(String[] args) {
        int[] a = {1, 4, 3};
        int[] b = {3, 2, 1};
        compareTriplets(a, b);
    }
    public static void compareTriplets(int[] a, int[] b){
        String ANSI_GREEN = "\u001B[32m";
        int alicePontos = 0;
        int bobPontos = 0;

        for(int i = 0; i < a.length; i++){
            if (a[i] > b[i]){
                alicePontos++;
            } else if(a[i] < b[i]){
                bobPontos++;
            }
        }
        if (alicePontos == bobPontos){
            System.out.println("Houve um empate!");
        } else if(alicePontos > bobPontos){
            System.out.println("Alice ganhou!");
        } else {
            System.out.println("Bob ganhou!");
        }
        System.out.println("=========================");
        System.out.println(ANSI_GREEN + "Alice: " + alicePontos + " " + "Bob: " + bobPontos);
    }
}
