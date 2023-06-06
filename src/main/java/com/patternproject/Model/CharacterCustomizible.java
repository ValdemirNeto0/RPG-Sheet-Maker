package com.patternproject.Model;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CharacterCustomizible implements BuilderCharacter{
    private CharacterSheet characterCustomized;
    private int xp, level;
    private ArrayList<String> informacoesBasicas;
    private ArrayList<Integer> informacoesCombate;
    private ArrayList<Integer> caracteristicas, pericias, salvaguarda;

    public CharacterCustomizible(){
        this.characterCustomized = reset();
    }
    public CharacterSheet reset(){
        return new CharacterSheet();
    }

    public void setInformacoesBasicas(){}
    public void setPontosHabilidades(){}
    public void setInformacoesCombate(){}

    public int rolarDado(){return this.characterCustomized.rolarDado();}
    //checa modificador
    public int checkModifier(int n){return this.characterCustomized.checkModifier(n);}
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
    }*/
