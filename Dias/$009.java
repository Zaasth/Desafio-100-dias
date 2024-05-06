package edu.wellinton.desafio.Dia1;
import java.util.Locale;
import java.util.Scanner;
/*
Dia: 09/100
https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true
 */
public class $009 {
    public static void main(String[] args) {
        stairCase();
    }

    public static void stairCase(){

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite a quantidade de degraus:");
        int numero = sc.nextInt();

        for(int i=1 ;i<=numero; i++){
            String escada = "#".repeat(i);

            System.out.printf("%" + numero + "s\n", escada);
        }
    }

}
