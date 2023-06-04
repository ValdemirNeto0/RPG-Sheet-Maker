package com.patternproject;
import java.util.ArrayList;

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
        arrayC.add(c.rolarDado()+1);arrayC.add(c.rolarDado()+1);arrayC.add(c.rolarDado()+1);
        arrayC.add(c.rolarDado()+1);arrayC.add(c.rolarDado()+1);arrayC.add(c.rolarDado()+1);
        //seta pericias
        ArrayList<Integer> arrayP = new ArrayList<Integer>();
        /*acrobacia, Arcanismo, atletismo, atuacao, blefar, furtividade, historia, intimidacao, intuicao
        investigacao, lidarAnimais, medicina, natureza, percepcao, persuasao, prestidigitacao, religiao
        survival, proeficiencia em atletismo e percepcao*/
        arrayP.add(c.checkModifier(arrayC.get(1)));arrayP.add(c.checkModifier(arrayC.get(3)));
        arrayP.add(c.checkModifier(arrayC.get(0)+2));arrayP.add(c.checkModifier(arrayC.get(5)));
        arrayP.add(c.checkModifier(arrayC.get(5)));arrayP.add(c.checkModifier(arrayC.get(1)));
        arrayP.add(c.checkModifier(arrayC.get(3)));arrayP.add(c.checkModifier(arrayC.get(5)));
        arrayP.add(c.checkModifier(arrayC.get(4)));arrayP.add(c.checkModifier(arrayC.get(3)));
        arrayP.add(c.checkModifier(arrayC.get(4)));arrayP.add(c.checkModifier(arrayC.get(4)));
        arrayP.add(c.checkModifier(arrayC.get(3)));arrayP.add(c.checkModifier(arrayC.get(4)));
        arrayP.add(c.checkModifier(arrayC.get(5)));arrayP.add(c.checkModifier(arrayC.get(1)));
        arrayP.add(c.checkModifier(arrayC.get(3)));arrayP.add(c.checkModifier(arrayC.get(4)));
        //seta as salvaguardas, bonus de proeficiencia e inspiracao
        ArrayList<Integer> arraySal = new ArrayList<Integer>();
        arraySal.add(c.checkModifier(arrayC.get(0)));arraySal.add(c.checkModifier(arrayC.get(1)));
        arraySal.add(c.checkModifier(arrayC.get(2)));arraySal.add(c.checkModifier(arrayC.get(3)));
        arraySal.add(c.checkModifier(arrayC.get(4)));arraySal.add(c.checkModifier(arrayC.get(5)));
        arraySal.add(2);arraySal.add(10);
        c.setPontosHabilidades(arrayC, arrayP, arraySal);
        return c.getCharacter();
    }
    //futuro public int checkProeficiencyBonus(int level){}
}
