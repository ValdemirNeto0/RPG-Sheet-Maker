package com.patternproject.Model;
import java.util.ArrayList;
import java.util.Scanner;

public class CharacterCustomizible implements BuilderCharacter{
    private CharacterSheet characterCustomized;
    private ArrayList<String> informacoesBasicas;
    private ArrayList<Integer> informacoesCombate;
    private ArrayList<Integer> caracteristicas, pericias, salvaguarda;
    private Scanner scanner;

    public CharacterCustomizible(){
        this.characterCustomized = reset();
        this.scanner = new Scanner(System.in);
        this.informacoesBasicas = new ArrayList<String>();
        this.informacoesCombate = new ArrayList<Integer>();
        this.caracteristicas = new ArrayList<Integer>();
        this.pericias = new ArrayList<Integer>();
        this.salvaguarda = new ArrayList<Integer>();
    }
    public CharacterSheet reset(){
        return new CharacterSheet();
    }

    public void setInformacoesBasicas(){
        System.out.println("(ATENCAO:Digite tudo como esta nos exemplos)\nEscolha o nome do seu Pesonagem: ");
        informacoesBasicas.add(scanner.nextLine());
        System.out.println("Escolha uma classe:\tBarbaro\tBardo\tBruxo\tClerigo\tDruida\nFeiticeiro"+
        "\tGuerreiro\tLadino\tMago\tMonge\tPaladino\tPatrulheiro");
        informacoesBasicas.add(scanner.nextLine());
        System.out.println("Escolha uma raça:\tAnao\tElfo\tHalfling\tHumano\tDraconato\nGnomo"+
        "\tMeio-Elfo\tMeio-Orc\tTiefling");
        informacoesBasicas.add(scanner.nextLine());
        System.out.println("Escolha seu Alinhamento:\nLeal e Bom\tLeal e Neutro\tLeal e Caotico"+
        "\nNeutro e Bom\tNeutro\tNeutro e Mau\nCaotico e Bom\tCaotico e Neutro\tCaotico e Mau");
        informacoesBasicas.add(scanner.nextLine());
        System.out.println("Escolha seu Antecedente:\tAcolito\tArtesao da Guilda\tArtista"+
        "\nCharlatao\tCriminoso\tEremita\tForasteiro\tHeroi do Povo\nMarinheiro\tNobre\tOrfao\tSabio\tSoldado");
        informacoesBasicas.add(scanner.nextLine());
        characterCustomized.setXp(0);characterCustomized.setLevel(1);
    }
    public void setPontosHabilidades(){
        //habilidades
        switch(informacoesBasicas.get(2)){
            case "Anao":
                caracteristicas.add(rolarDado());caracteristicas.add(rolarDado());caracteristicas.add(rolarDado()+2);
                caracteristicas.add(rolarDado());caracteristicas.add(rolarDado());caracteristicas.add(rolarDado());
                break;
            case "Elfo":
                caracteristicas.add(rolarDado());caracteristicas.add(rolarDado()+2);caracteristicas.add(rolarDado());
                caracteristicas.add(rolarDado());caracteristicas.add(rolarDado());caracteristicas.add(rolarDado());
                break;
            case "Halfling":
                caracteristicas.add(rolarDado());caracteristicas.add(rolarDado()+2);caracteristicas.add(rolarDado());
                caracteristicas.add(rolarDado());caracteristicas.add(rolarDado());caracteristicas.add(rolarDado());
                break;
            case "Humano":
                caracteristicas.add(rolarDado()+1);caracteristicas.add(rolarDado()+1);caracteristicas.add(rolarDado()+1);
                caracteristicas.add(rolarDado()+1);caracteristicas.add(rolarDado()+1);caracteristicas.add(rolarDado()+1);
                break; 
            case "Draconato":
                caracteristicas.add(rolarDado()+1);caracteristicas.add(rolarDado());caracteristicas.add(rolarDado());
                caracteristicas.add(rolarDado());caracteristicas.add(rolarDado());caracteristicas.add(rolarDado()+2);
                break; 
            case "Gnomo":
                caracteristicas.add(rolarDado());caracteristicas.add(rolarDado());caracteristicas.add(rolarDado());
                caracteristicas.add(rolarDado()+2);caracteristicas.add(rolarDado());caracteristicas.add(rolarDado());
                break;
            case "Meio-Elfo":
                //caracteristicas escolhidas: inteligencia e sabedoria
                caracteristicas.add(rolarDado());caracteristicas.add(rolarDado());caracteristicas.add(rolarDado());
                caracteristicas.add(rolarDado()+1);caracteristicas.add(rolarDado()+1);caracteristicas.add(rolarDado()+2);
                break; 
            case "Meio-Orc":
                caracteristicas.add(rolarDado());caracteristicas.add(rolarDado());caracteristicas.add(rolarDado());
                caracteristicas.add(rolarDado());caracteristicas.add(rolarDado());caracteristicas.add(rolarDado());
                break;
            case "Tiefling":
                caracteristicas.add(rolarDado()+2);caracteristicas.add(rolarDado());caracteristicas.add(rolarDado()+1);
                caracteristicas.add(rolarDado());caracteristicas.add(rolarDado());caracteristicas.add(rolarDado());
                break;
            default:
                caracteristicas.add(rolarDado());caracteristicas.add(rolarDado());caracteristicas.add(rolarDado());
                caracteristicas.add(rolarDado());caracteristicas.add(rolarDado());caracteristicas.add(rolarDado());
                break;
        }
        //pericias
        pericias.add(checkModifier(caracteristicas.get(1)));pericias.add(checkModifier(caracteristicas.get(3)));
        pericias.add(checkModifier(caracteristicas.get(0)));pericias.add(checkModifier(caracteristicas.get(5)));
        pericias.add(checkModifier(caracteristicas.get(5)));pericias.add(checkModifier(caracteristicas.get(1)));
        pericias.add(checkModifier(caracteristicas.get(3)));pericias.add(checkModifier(caracteristicas.get(5)));
        pericias.add(checkModifier(caracteristicas.get(4)));pericias.add(checkModifier(caracteristicas.get(3)));
        pericias.add(checkModifier(caracteristicas.get(4)));pericias.add(checkModifier(caracteristicas.get(4)));
        pericias.add(checkModifier(caracteristicas.get(3)));pericias.add(checkModifier(caracteristicas.get(4)));
        pericias.add(checkModifier(caracteristicas.get(5)));pericias.add(checkModifier(caracteristicas.get(1)));
        pericias.add(checkModifier(caracteristicas.get(3)));pericias.add(checkModifier(caracteristicas.get(4)));
        //salavaguardas
        salvaguarda.add(checkModifier(caracteristicas.get(0)));salvaguarda.add(checkModifier(caracteristicas.get(1)));
        salvaguarda.add(checkModifier(caracteristicas.get(2)));salvaguarda.add(checkModifier(caracteristicas.get(3)));
        salvaguarda.add(checkModifier(caracteristicas.get(4)));salvaguarda.add(checkModifier(caracteristicas.get(5)));
        salvaguarda.add(2);salvaguarda.add(10);
    }
    public void setInformacoesCombate(){
        //classeArm, iniciativa
        informacoesCombate.add(10);informacoesCombate.add(10);
        //deslocamento
        switch(informacoesBasicas.get(2)){
            case "Anao":informacoesCombate.add(8);break;
            case "Elfo":informacoesCombate.add(9);break;
            case "Halfling":informacoesCombate.add(8);break;
            case "Humano":informacoesCombate.add(9);break; 
            case "Draconato":informacoesCombate.add(9);break; 
            case "Gnomo":informacoesCombate.add(8);break;
            case "Meio-Elfo":informacoesCombate.add(9);break; 
            case "Meio-Orc":informacoesCombate.add(9);break;
            case "Tiefling":informacoesCombate.add(9);break;
            default:informacoesCombate.add(9);break;
        }
        //vidaTotal, vidaAtual, vidaTemporaria, dadoVida, nSucess, nfalhas

        switch(informacoesBasicas.get(1)){
            case "Barbaro":informacoesCombate.add(12);informacoesCombate.add(12);informacoesCombate.add(0);
            informacoesCombate.add(12);informacoesCombate.add(0);informacoesCombate.add(0);break;
            case "Bardo":informacoesCombate.add(8);informacoesCombate.add(8);informacoesCombate.add(0);
            informacoesCombate.add(8);informacoesCombate.add(0);informacoesCombate.add(0);break;
            case "Bruxo":informacoesCombate.add(8);informacoesCombate.add(8);informacoesCombate.add(0);
            informacoesCombate.add(8);informacoesCombate.add(0);informacoesCombate.add(0);break;
            case "Clerigo":informacoesCombate.add(8);informacoesCombate.add(8);informacoesCombate.add(0);
            informacoesCombate.add(8);informacoesCombate.add(0);informacoesCombate.add(0);break; 
            case "Druida":informacoesCombate.add(8);informacoesCombate.add(8);informacoesCombate.add(0);
            informacoesCombate.add(8);informacoesCombate.add(0);informacoesCombate.add(0);break;
            case "Feiticeiro":informacoesCombate.add(6);informacoesCombate.add(6);informacoesCombate.add(0);
            informacoesCombate.add(6);informacoesCombate.add(0);informacoesCombate.add(0);break;
            case "Guerreiro":informacoesCombate.add(10);informacoesCombate.add(10);informacoesCombate.add(0);
            informacoesCombate.add(10);informacoesCombate.add(0);informacoesCombate.add(0);break; 
            case "Ladino":informacoesCombate.add(8);informacoesCombate.add(8);informacoesCombate.add(0);
            informacoesCombate.add(8);informacoesCombate.add(0);informacoesCombate.add(0);break;
            case "Mago":informacoesCombate.add(6);informacoesCombate.add(6);informacoesCombate.add(0);
            informacoesCombate.add(6);informacoesCombate.add(0);informacoesCombate.add(0);break;
            case "Monge":informacoesCombate.add(8);informacoesCombate.add(8);informacoesCombate.add(0);
            informacoesCombate.add(8);informacoesCombate.add(0);informacoesCombate.add(0);break;
            case "Paladino":informacoesCombate.add(10);informacoesCombate.add(10);informacoesCombate.add(0);
            informacoesCombate.add(10);informacoesCombate.add(0);informacoesCombate.add(0);break;
            case "Patrulheiro":informacoesCombate.add(10);informacoesCombate.add(10);informacoesCombate.add(0);
            informacoesCombate.add(10);informacoesCombate.add(0);informacoesCombate.add(0);break;
            default:informacoesCombate.add(8);informacoesCombate.add(8);informacoesCombate.add(0);
            informacoesCombate.add(8);informacoesCombate.add(0);informacoesCombate.add(0);break;
        }
    }
    public CharacterSheet getCharacter(){
        CharacterSheet characterHumanDone = this.characterCustomized;
        this.characterCustomized = reset();
        return characterHumanDone;
    }

    public int rolarDado(){return this.characterCustomized.rolarDado();}
    //checa modificador
    public int checkModifier(int n){return this.characterCustomized.checkModifier(n);}
}