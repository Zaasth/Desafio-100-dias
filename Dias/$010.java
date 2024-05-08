package edu.wellinton.desafio.Dia1;
import java.util.*;
/*
Dia 10/100
https://www.hackerrank.com/challenges/encryption/problem?isFullScreen=true
 */
public class $010 {

    public static void main(String[] args) {
        encrypted();
    }

    public static void encrypted(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        String inputUser = sc.nextLine();
        inputUser = inputUser.toLowerCase();

        String inputReplace = inputUser.replace(" ", "");

        String encrypted = inputUser.substring(0, 4).replace(" ", "");
        String encrypted2 = inputUser.substring(4, 8).replace(" ", "");
        String encrypted3 = inputUser.substring(8, 12).replace(" ", "");
        String encrypted4 = inputUser.substring(12, inputUser.length()).replace(" ", "");
        System.out.println(encrypted.concat("\n" + encrypted2).concat("\n" + encrypted3).concat("\n" + encrypted4));

        System.out.println("==================");
        if (inputUser.length() < 14) {
            System.out.println("Texto muito pequeno");
        } else {
            System.out.print(encrypted.substring(0, 1).concat(encrypted2.substring(0, 1)).concat(encrypted3.substring(0,1).concat(encrypted4.substring(0,1))));
            System.out.print(" ");
            System.out.print(encrypted.substring(1, 2).concat(encrypted2.substring(1, 2)).concat(encrypted3.substring(1,2).concat(encrypted4.substring(1,2))));
            System.out.print(" ");
            System.out.print(encrypted.substring(2, encrypted.length()).concat(encrypted2.substring(2, encrypted2.length())).concat(encrypted3.substring(2, encrypted3.length()).concat(encrypted4.substring(2, encrypted4.length()))));
            System.out.print(" ");
            System.out.print(encrypted.substring(3, encrypted.length()).concat(encrypted2.substring(3, encrypted2.length())).concat(encrypted3.substring(3, encrypted3.length()).concat(encrypted4.substring(3, encrypted4.length()))));
        }
    }
}