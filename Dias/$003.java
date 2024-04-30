package edu.wellinton.desafio.Dia1;
/*
DIA 3/100
Desenvolva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit.

Regra adicional 2: Pode ser usada qualquer linguagem para cumprir o desafio, porém não é permitida nenhum busca de códigos além da documentação oficial.
 */
public class $003 {
    public static void main(String[] args) {
        converterCelsius(10);
    }
    public static void converterCelsius(double celsius){
       double kelvin = (celsius + 273.15);
       double reaumur =(celsius * 0.8);
       double rankine =(celsius * 1.8) + 491.67;
       double fahrenheit = (celsius * 1.8) + 32;

        System.out.println(celsius + "°C convertido para outras escalas de temperaturas:");
        System.out.println("Kelvin: " + kelvin + "\n" + "Reaumur: " + reaumur + "\n" + "Rankine: " + rankine + "\n" + "Fahrenheit: " + fahrenheit);
    }
}
