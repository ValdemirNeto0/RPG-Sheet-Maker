package com.patternproject;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CharacterCustomizible implements BuilderCharacter{
    private CharacterSheet characterCustomized;
    private int xp, level;
    private ArrayList<String> informacoesBasicas;
    private ArrayList<Integer> informacoesCombate;
    private ArrayList<Integer> caracteristicas, pericias, salvaguarda;


    public void setInformacoesBasicas(){}

    public void setPontosHabilidades(){}

    public void setInformacoesCombate(){}
}
    /*
    private CharacterSheet characterCustomizible;
    //construtor
    public CharacterCustomizible(){
        this.characterCustomizible = reset();
    }
    //reseta a instancia
    public CharacterSheet reset(){
        return new CharacterSheet();
    }
    //getters e setters
    public void setInformacoesBasicas(){
        //chamar os metodos nas classes dos objetos ao inves do director
        ArrayList<String> ArrayIF = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        characterCustomizible.setXp();
        characterCustomizible.setLevel();
        characterCustomizible.setInformacoesBasicas();
    }
    public void setInformacoesCombate(ArrayList<Integer> informacoesCombate){
        characterCustomizible.setInformacoesCombate(informacoesCombate);
    }
    public void setPontosHabilidades(ArrayList<Integer> caracteristicas, ArrayList<Integer> pericias,
    ArrayList<Integer> salvaguarda){
        characterCustomizible.setCaracteristicas(caracteristicas);
        characterCustomizible.setPericias(pericias);
        characterCustomizible.setSalvaguarda(salvaguarda);
    }
    public CharacterSheet getCharacter(){
        CharacterSheet characterHumanDone = this.characterCustomizible;
        this.characterCustomizible = reset();
        return characterHumanDone;
    }
    //rola dado
    public int rolarDado(){return this.characterCustomizible.rolarDado();}
    //checa modificador
    public int checkModifier(int n){return this.characterCustomizible.checkModifier(n);}
}*/
