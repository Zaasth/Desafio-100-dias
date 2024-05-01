package edu.wellinton.desafio.Dia1;

public class $004 {
    public static void main(String[] args) {
        multiplicar(10);
    }
    public static void multiplicar(int n) {
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(STR."\{n} x \{i} = \{result}");
        }
    }
}
