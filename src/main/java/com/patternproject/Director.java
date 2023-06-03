package com.patternproject;
import java.util.ArrayList;
import java.util.Random;

public class Director {
    //chama um construtor para fazer um humano guerreiro basico
    public CharacterSheet HumanoGuerreiro(){
        CharacterHuman c = new CharacterHuman();
        //seta as informacoes basicas (IB)
        ArrayList<String> arrayIB = new ArrayList<String>();
        arrayIB.add("Alberto");arrayIB.add("Guerreiro");arrayIB.add("Humano");
        arrayIB.add("Neutro");arrayIB.add("Heroi do Povo");
        c.setInformacoesBasicas(0, 1, arrayIB);
        //seta as informacoes de combate (IC)
        ArrayList<Integer> arrayIC = new ArrayList<Integer>();
        arrayIC.add(12);arrayIC.add(10);arrayIC.add(9);
        arrayIC.add(10);arrayIC.add(0);arrayIC.add(10);
        arrayIC.add(0);arrayIC.add(0);
        return c.getCharacter();
    }
    //faz a raolgagem do dado
    public int rolarDado(){
        //objeto que simula a rolagem de um dado
        Random rand = new Random();
        int resultado;
        int dado1,dado2,dado3,dado4;
        dado1 = rand.nextInt(7);
        dado2 = rand.nextInt(7);
        dado3 = rand.nextInt(7);
        dado4 = rand.nextInt(7);
        if(dado1<dado2 && dado1<dado3 && dado1<dado4){
            resultado = (dado2+dado3+dado4);
        }else if(dado2<dado1 && dado2<dado3 && dado2<dado4){
            resultado = (dado1+dado3+dado4);
        }else if(dado3<dado1 && dado3<dado2 && dado3<dado4){
            resultado = (dado1+dado2+dado4);
        }else{
            resultado = (dado1+dado2+dado3);
        }
        return resultado;
    }
}
