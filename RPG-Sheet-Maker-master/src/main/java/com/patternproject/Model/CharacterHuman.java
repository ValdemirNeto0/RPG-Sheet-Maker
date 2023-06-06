package com.patternproject.Model;
import java.util.ArrayList;

public class CharacterHuman implements BuilderCharacter{
    private CharacterSheet characterHuman;
    private ArrayList<String> informacoesBasicas = new ArrayList<String>();
    private ArrayList<Integer> informacoesCombate = new ArrayList<Integer>();
    private ArrayList<Integer> caracteristicas = new ArrayList<Integer>();
    private ArrayList<Integer> pericias = new ArrayList<Integer>();
    private ArrayList<Integer> salvaguarda = new ArrayList<Integer>();
    //construtor
    public CharacterHuman(){
        this.characterHuman = reset();
        setInformacoesBasicas();
        setInformacoesCombate();
        setPontosHabilidades();
    }
    //reseta a instancia
    public CharacterSheet reset(){
        return new CharacterSheet();
    }
    //getters e setters
    public void setInformacoesBasicas(){
        informacoesBasicas.add("Alberto");informacoesBasicas.add("Guerreiro");
        informacoesBasicas.add("Humano");informacoesBasicas.add("Neutro");
        informacoesBasicas.add("Heroi do Povo");
        characterHuman.setXp(0);
        characterHuman.setLevel(1);
        characterHuman.setInformacoesBasicas(informacoesBasicas);
    }
    public void setInformacoesCombate(){
        informacoesCombate.add(12);informacoesCombate.add(10);informacoesCombate.add(9);
        informacoesCombate.add(10);informacoesCombate.add(0);informacoesCombate.add(10);
        informacoesCombate.add(0);informacoesCombate.add(0);
        characterHuman.setInformacoesCombate(informacoesCombate);
    }
    public void setPontosHabilidades(){
        //For, Des, Con, Int, Sab, Car, nesta ordem
        caracteristicas.add(rolarDado()+1);caracteristicas.add(rolarDado()+1);caracteristicas.add(rolarDado()+1);
        caracteristicas.add(rolarDado()+1);caracteristicas.add(rolarDado()+1);caracteristicas.add(rolarDado()+1);
        //seta pericias
        /*acrobacia, Arcanismo, atletismo, atuacao, blefar, furtividade, historia, intimidacao, intuicao
        investigacao, lidarAnimais, medicina, natureza, percepcao, persuasao, prestidigitacao, religiao
        survival, proeficiencia em atletismo e percepcao*/
        pericias.add(checkModifier(caracteristicas.get(1)));pericias.add(checkModifier(caracteristicas.get(3)));
        pericias.add(checkModifier(caracteristicas.get(0)+2));pericias.add(checkModifier(caracteristicas.get(5)));
        pericias.add(checkModifier(caracteristicas.get(5)));pericias.add(checkModifier(caracteristicas.get(1)));
        pericias.add(checkModifier(caracteristicas.get(3)));pericias.add(checkModifier(caracteristicas.get(5)));
        pericias.add(checkModifier(caracteristicas.get(4)));pericias.add(checkModifier(caracteristicas.get(3)));
        pericias.add(checkModifier(caracteristicas.get(4)));pericias.add(checkModifier(caracteristicas.get(4)));
        pericias.add(checkModifier(caracteristicas.get(3)));pericias.add(checkModifier(caracteristicas.get(4)));
        pericias.add(checkModifier(caracteristicas.get(5)));pericias.add(checkModifier(caracteristicas.get(1)));
        pericias.add(checkModifier(caracteristicas.get(3)));pericias.add(checkModifier(caracteristicas.get(4)));
        //seta as salvaguardas, bonus de proeficiencia e inspiracao
        salvaguarda.add(checkModifier(caracteristicas.get(0)));salvaguarda.add(checkModifier(caracteristicas.get(1)));
        salvaguarda.add(checkModifier(caracteristicas.get(2)));salvaguarda.add(checkModifier(caracteristicas.get(3)));
        salvaguarda.add(checkModifier(caracteristicas.get(4)));salvaguarda.add(checkModifier(caracteristicas.get(5)));
        salvaguarda.add(2);salvaguarda.add(10);
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