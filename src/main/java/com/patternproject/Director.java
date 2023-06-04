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
        c.setInformacoesCombate(arrayIC);
        //seta informacoes de caracteristicas
        ArrayList<Integer> arrayC = new ArrayList<Integer>();
        //For, Des, Con, Int, Sab, Car, nesta ordem
        arrayC.add(rolarDado()+1);arrayC.add(rolarDado()+1);arrayC.add(rolarDado()+1);
        arrayC.add(rolarDado()+1);arrayC.add(rolarDado()+1);arrayC.add(rolarDado()+1);
        //seta pericias
        ArrayList<Integer> arrayP = new ArrayList<Integer>();
        /*acrobacia, Arcanismo, atletismo, atuacao, blefar, furtividade, historia, intimidacao, intuicao
        investigacao, lidarAnimais, medicina, natureza, percepcao, persuasao, prestidigitacao, religiao
        survival, proeficiencia em atletismo e percepcao*/
        arrayP.add(checkModifier(arrayC.get(1)));arrayP.add(checkModifier(arrayC.get(3)));
        arrayP.add(checkModifier(arrayC.get(0)+2));arrayP.add(checkModifier(arrayC.get(5)));
        arrayP.add(checkModifier(arrayC.get(5)));arrayP.add(checkModifier(arrayC.get(1)));
        arrayP.add(checkModifier(arrayC.get(3)));arrayP.add(checkModifier(arrayC.get(5)));
        arrayP.add(checkModifier(arrayC.get(4)));arrayP.add(checkModifier(arrayC.get(3)));
        arrayP.add(checkModifier(arrayC.get(4)));arrayP.add(checkModifier(arrayC.get(4)));
        arrayP.add(checkModifier(arrayC.get(3)));arrayP.add(checkModifier(arrayC.get(4)));
        arrayP.add(checkModifier(arrayC.get(5))+2);arrayP.add(checkModifier(arrayC.get(1)));
        arrayP.add(checkModifier(arrayC.get(3)));arrayP.add(checkModifier(arrayC.get(4)));
        //seta as salvaguardas, bonus de proeficiencia e inspiracao
        ArrayList<Integer> arraySal = new ArrayList<Integer>();
        arraySal.add(checkModifier(arrayC.get(0)));arraySal.add(checkModifier(arrayC.get(1)));
        arraySal.add(checkModifier(arrayC.get(2)));arraySal.add(checkModifier(arrayC.get(3)));
        arraySal.add(checkModifier(arrayC.get(4)));arraySal.add(checkModifier(arrayC.get(5)));
        arraySal.add(2);arraySal.add(10);
        c.setPontosHabilidades(arrayC, arrayP, arraySal);
        return c.getCharacter();
    }
    //faz a rolagem do dado
    public int rolarDado(){
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
    //chca qual o modificador de acordo com o valor da caracteristica (reduz o uso de outra array para armazenar)
    public int checkModifier(int n){
        int modifier = 0;
        if(n>=20){
            modifier = 5;
        }else if(n>=18){
            modifier = 4;
        }else if(n>=16){
            modifier = 3;
        }else if(n>=14){
            modifier = 2;
        }else if(n>=12){
            modifier = 1;
        }else if(n>=10){
            modifier = 0;
        }else if(n>=8){
            modifier = -1;
        }else if(n>=6){
            modifier = -2;
        }else if(n>=4){
            modifier = -3;
        }else{
            modifier = -4;
        }
        return modifier;
    }

    //futuro public int checkProeficiencyBonus(int level){}
}
