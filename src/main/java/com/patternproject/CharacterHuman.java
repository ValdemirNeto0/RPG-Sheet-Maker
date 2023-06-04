package com.patternproject;

import java.util.ArrayList;

public class CharacterHuman implements BuilderCharacter{

    private CharacterSheet characterHuman;
    //construtor
    public CharacterHuman(){
        this.characterHuman = reset();
    }
    //reseta a instancia
    public CharacterSheet reset(){
        return new CharacterSheet();
    }
    //getters e setters
    public void setInformacoesBasicas(int xp, int level, ArrayList<String> informacoesBasicas){
        characterHuman.setXp(xp);
        characterHuman.setLevel(level);
        characterHuman.setInformacoesBasicas(informacoesBasicas);
    }
    public void setInformacoesCombate(ArrayList<Integer> informacoesCombate){
        characterHuman.setInformacoesCombate(informacoesCombate);
    }
    public void setPontosHabilidades(ArrayList<Integer> caracteristicas, ArrayList<Integer> pericias,
    ArrayList<Integer> salvaguarda){
        characterHuman.setCaracteristicas(caracteristicas);
        characterHuman.setPericias(pericias);
        characterHuman.setSalvaguarda(salvaguarda);
    }
    public CharacterSheet getCharacter(){
        CharacterSheet characterHumanDone = this.characterHuman;
        this.characterHuman = reset();
        return characterHumanDone;
    }
    //rola dado
    public int rolarDado(){return this.characterHuman.rolarDado();}
    //checa modificador
    public int checkModifier(int n){return this.characterHuman.checkModifier(n);}
}