package com.patternproject;

import java.util.ArrayList;
import java.util.Random;

public class CharacterSheet {
    private int xp;
    private int level;
    //nomePersonagem, classe, raca, alinhamento, antecedente
    private ArrayList<String> informacoesBasicas;

    //Forca, destreza, constituicao, inteligencia, sabedoria, charisma
    private ArrayList <Integer> caracteristicas;

    //acrobacia, Arcanismo, atletismo, atuacao, blefar, furtividade, historia, intimidacao, intuicao
    //investigacao, lidarAnimais, medicina, natureza, percepcao, persuasao, prestidigitacao, religiao, survival
    private ArrayList<Integer> pericias;

    //Sforca, Sdestreza, Sconstituicao, Sinteligencia, Ssabedoria, Scarisma, BonusProeficiencia e inspiracao
    private ArrayList<Integer> salvaguarda;
    
    //classeArm, iniciativa, deslocamento, vidaTotal, vidaAtual, vidaTemporaria, dadoVida, nSucess, nfalhas
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
        return "\nNome do Personagem: "+informacoesBasicas.get(0)+"\nClasse: "+informacoesBasicas.get(1)+"\nRaça: "+
        informacoesBasicas.get(2)+"\nAlinhamento: "+informacoesBasicas.get(3)+"\nAntecedente: "+
        informacoesBasicas.get(4)+"\n\nHabilidades:\nForça: "+caracteristicas.get(0)+"\tDestreza: "+
        caracteristicas.get(1)+"\tConstituiçao: "+caracteristicas.get(2)+"\tInteligencia: "+
        caracteristicas.get(3)+"\tSabedoria: "+caracteristicas.get(4)+"\tCarisma: "+
        caracteristicas.get(5)+"\n\nLista de Pericias:\nAcrobacia: "+pericias.get(0)+"\tArcanismo: "+
        pericias.get(1)+"\tAtletismo: "+pericias.get(2)+"\tAtuacao: "+pericias.get(3)+"\tBlefar: "+
        pericias.get(4)+"\nFurtividade: "+pericias.get(5)+"\tHistória: "+pericias.get(6)+"\tIntimidaçao: "+
        pericias.get(7)+"\tIntuiçao: "+pericias.get(8)+"\nInvestigaçao: "+pericias.get(9)+"\tLidar com Animais: "+
        pericias.get(10)+"\tMedicina: "+pericias.get(11)+"\tNatureza: "+pericias.get(12)+"\nPercepçao: "+
        pericias.get(13)+"\tPersuasao: "+pericias.get(14)+"\tPrestidigitaçao: "+pericias.get(15)+"\tReligiao: "+
        pericias.get(16)+"\nSobrevivência: "+pericias.get(17)+"\n\nSalvaguardas:\nForça: "+salvaguarda.get(0)+
        "\tDestreza: "+salvaguarda.get(1)+"\tConstituiçao: "+salvaguarda.get(2)+"\tInteligência: "+salvaguarda.get(3)+
        "\tSabedoria: "+salvaguarda.get(4)+"\tCarisma: "+salvaguarda.get(5)+"\nBonus de Preoficiência: "+salvaguarda.get(6)+
        "\nInspiraçao: "+salvaguarda.get(7);
    }

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
    //checa o modificador
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
}
