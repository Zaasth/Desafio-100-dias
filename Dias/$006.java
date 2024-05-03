package edu.wellinton.desafio.Dia1;
/*
Vamos criar um exemplo de uma classe para representar uma SmartTV onde:

Ela tenha as características: ligada (boolean), canal (int) e volume (int);

Nossa TV poderá ligar e desligar e assim mudar o estado ligada;

Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;

Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.
 */
public class $006 {
    //ATRIBUTOS
    boolean onOff = false;
    int chanel = 1;
    int sound = 25;

    //METODOS
    public void ligar() {
        this.onOff = true;
        System.out.println("Tv ligada");
    }
    public void delisgar() {
        this.onOff = false;
        System.out.println("Tv desligada");
    }
    public void aumentarSom() {
        this.sound++;
        System.out.println("Som aumentado para " + sound);
    }
    public void reduzirSom() {
        this.sound--;
        System.out.println("Som reduzido para " + sound);
    }
    public void mudarCanal(int novoCanal){
        if(novoCanal == 0){
            System.out.println("Canal inválido");
        } else if(novoCanal != 0){
            System.out.println("Canal atual: " + (chanel = novoCanal));
        }
    }
    public void aumentarCanal(){
        if (chanel == 0){
            System.out.println("Canal inválido");
        } else{
            System.out.println("Canal atual: " + chanel++);
        }
    }
    public void reduzirCanal(){
        if (chanel == 0){
            System.out.println("Canal inválido");
        } else{
            System.out.println("Canal atual: " + chanel--);
        }
    }
}
