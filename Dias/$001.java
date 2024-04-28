package edu.wellinton.desafio.Dia1;
//DIA 1/100
//Faça uma função que calcule a média da soma de três números.
//Regra adicional: Esses três números tem que ser gerados usando pseudoaleatoriedade.
//
//Regra adicional 2: Pode ser usada qualquer linguagem para cumprir o desafio, porém não é permitida nenhum busca além da documentação oficial.

public class $001 {
    public static void main(String[] args) {
        Media();
    }
    public static void Media(){
        double n1 = (Math.random() * 1000) + 1, n2 = (Math.random() * 1000) + 1, n3 = (Math.random() * 1000) + 1;
        double res = (n1 + n2 + n3) / 3;

        System.out.println("A média da soma entre " + n1 + " | " + n2 + " | " + n3 + " é igual a: " + res);
    }
}
