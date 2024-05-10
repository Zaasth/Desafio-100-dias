package edu.wellinton.desafio.Dia1;

import java.util.*;
/*
Dia 12/100
https://www.hackerrank.com/challenges/java-comparator/problem?isFullScreen=true
 */
public class $012 {

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] jogadores = new Player[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do jogador: ");
            String nome = sc.nextLine();
            System.out.println("Digite a pontuação do jogador: ");
            int pontuacao = sc.nextInt();
            sc.nextLine();
            jogadores[i] = new Player(nome, pontuacao);
        }


        Player[] jogadoresComMaioresPontuacoes = new Player[5];
        for (int i = 0; i < jogadores.length; i++) {
            if (jogadoresComMaioresPontuacoes[0] == null || jogadores[i].mostrarPontuacao() > jogadoresComMaioresPontuacoes[0].mostrarPontuacao()) {
                jogadoresComMaioresPontuacoes[4] = jogadoresComMaioresPontuacoes[3];
                jogadoresComMaioresPontuacoes[3] = jogadoresComMaioresPontuacoes[2];
                jogadoresComMaioresPontuacoes[2] = jogadoresComMaioresPontuacoes[1];
                jogadoresComMaioresPontuacoes[1] = jogadoresComMaioresPontuacoes[0];
                jogadoresComMaioresPontuacoes[0] = jogadores[i];
            } else if (jogadoresComMaioresPontuacoes[1] == null || jogadores[i].mostrarPontuacao() > jogadoresComMaioresPontuacoes[1].mostrarPontuacao()) {
                jogadoresComMaioresPontuacoes[4] = jogadoresComMaioresPontuacoes[3];
                jogadoresComMaioresPontuacoes[3] = jogadoresComMaioresPontuacoes[2];
                jogadoresComMaioresPontuacoes[2] = jogadoresComMaioresPontuacoes[1];
                jogadoresComMaioresPontuacoes[1] = jogadores[i];
            } else if (jogadoresComMaioresPontuacoes[2] == null || jogadores[i].mostrarPontuacao() > jogadoresComMaioresPontuacoes[2].mostrarPontuacao()) {
                jogadoresComMaioresPontuacoes[4] = jogadoresComMaioresPontuacoes[3];
                jogadoresComMaioresPontuacoes[3] = jogadoresComMaioresPontuacoes[2];
                jogadoresComMaioresPontuacoes[2] = jogadores[i];
            } else if (jogadoresComMaioresPontuacoes[3] == null || jogadores[i].mostrarPontuacao() > jogadoresComMaioresPontuacoes[3].mostrarPontuacao()) {
                jogadoresComMaioresPontuacoes[4] = jogadoresComMaioresPontuacoes[3];
                jogadoresComMaioresPontuacoes[3] = jogadores[i];
            } else if (jogadoresComMaioresPontuacoes[4] == null || jogadores[i].mostrarPontuacao() > jogadoresComMaioresPontuacoes[4].mostrarPontuacao()) {
                jogadoresComMaioresPontuacoes[4] = jogadores[i];
            }
        }

        System.out.println("Resultados:");
        for (int i = 0; i < jogadoresComMaioresPontuacoes.length; i++) {
            System.out.println((i + 1) + " colocado: " + jogadoresComMaioresPontuacoes[i].mostrarNome() + " com " + jogadoresComMaioresPontuacoes[i].mostrarPontuacao() + " pontos!");
        }
    }

    class Player{
        String name;
        int score;

        Player(String name, int score){
            this.name = name;
            this.score = score;
        }

        public String mostrarInfos(){
            return "Nome: " + name + ", Score: " + score;
        }

        public int mostrarPontuacao(){
            return score;
        }

        public String mostrarNome(){
            return name;
        }
    }

}
