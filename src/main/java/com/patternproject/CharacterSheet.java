package com.patternproject;

import java.util.ArrayList;

public class CharacterSheet {
    private int xp;
    private int level;
    //nomePersonagem, classe, raca, alinhamento, antecedente
    private ArrayList<String> informacoesBasicas;

    //Forca, destreza, constituicao, inteligencia, sabedoria, charisma
    private ArrayList <Integer> caracteristicas;

    //acrobacia, Arcanismo, atletismo, atuacao, blefar, furtividade, historia, intimidacao, intuicao
    //investigacao, lidarAnimais, medicina, natureza, percepcao, persuasao, prestidigitacao, religia, survival
    private ArrayList<Integer> pericias;

    //Sforca, Sdestreza, Sconstituicao, Sinteligencia, Ssabedoria, Scharisma, BonusProeficiencia e inspiracao
    private ArrayList<Integer> salvaguarda;
    
    //classeArmadura, iniciativa, deslocamento, vidaAtual, vidaTemporaria, dadoVida, nSucesso, nfalhas
    private ArrayList<Integer> informacoesCombate;

    //get set - informacoes basicas
    public void setInformacoesBasicas(ArrayList<String> informacoesBasicas){
        this.informacoesBasicas = informacoesBasicas;
    }
    public ArrayList<String> getInformacoesBasicas(){return this.informacoesBasicas;}
    //get set - caracteristicas
    public void setCaracteristicas(ArrayList<Integer> caracteristicas){
        this.caracteristicas = caracteristicas;
    }
    public ArrayList<Integer> getCaracteristicas(){return this.caracteristicas;}
    //get set - pericias
    public void setPericias(ArrayList<Integer> pericias){
        this.pericias = pericias;
    }
    public ArrayList<Integer> getPericias(){return this.pericias;}
    //get set - salvaguarda
    public void setSalvaguarda(ArrayList<Integer> salvaguarda){
        this.salvaguarda = salvaguarda;
    }
    public ArrayList<Integer> getSalvaguarda(){return this.salvaguarda;}
    //get set - informacoes de commbate
    public void setInformacoesCombate(ArrayList<Integer> informacoesCombate){
        this.informacoesCombate = informacoesCombate;
    }
    public ArrayList<Integer> getInformacoesCombate(){return this.informacoesCombate;}
    //get set - xp
    public void setXp(int xp){this.xp = xp;}
    public int getXp(){return this.xp;}
    //get set - level
    public void setLevel(int level){this.level = level;}
    public int getLevel(){return this.level;}

    @Override
    public String toString(){
        return "Nome do Personagem: "+informacoesBasicas.get(0)+"\nClasse: "+informacoesBasicas.get(1)+"\nRaça: "+informacoesBasicas.get(2)+
        "\nAlinhamento: "+informacoesBasicas.get(3)+"\nAntecedente: "+informacoesBasicas.get(4);
    }
}
