package com.patternproject.View;
import java.util.Scanner;
import com.patternproject.Controller.Director;
import com.patternproject.Model.CharacterSheet;

public final class Main {
    public static void main(String[] args) {
        Director diretor = new Director();
        CharacterSheet personagem1 = new CharacterSheet();
        personagem1 = diretor.HumanoGuerreiro();
        Scanner scanner = new Scanner(System.in);
        int rodando = 1, opcao = 0;
        System.out.println("Personagem Humano Guerreiro ja esta criado por padrao!");
        while(rodando == 1){
            System.out.println("1 - ver personagem humano guerreiro padrao\t2 - Criar novo personagem\t3 - sair");
            opcao = scanner.nextInt();
            if(opcao == 1){
                System.out.println(personagem1);
            }else if(opcao == 2){
                CharacterSheet personagem2 = new CharacterSheet();
                personagem2 = diretor.PersonagemCustomizavel();
                System.out.println(personagem2);
            }else{
                System.out.println("Obrigado pela atençao!");rodando = 2;
            }
        }
        scanner.close();
    }

    
    /*Uma interface BuilderPersonagem que implementa tudo que um personagem pode ter no caso:
        reset() - que vai apenas dizer this.ficha = new Carachter() que vai usar os de baixo
        para setar suas informacoes;

        InformacoesBasicas()
        PontosHabilidades()
        InformacoesCombate()
        (futuro)InformacoesPessoais()
        (futuro)Proeficiencias_E_Linguagens()
        (futuro)Equipamento()
        (futuro)Magias()
        (futuro)Passado()
        getResult() - que vai teronar o personagem pronto e resetar, meio que "esvaziar" o molde

    Um Director que vai chamar os tipos de builders{
        MakeCaracther(HumanoGuerreiro) por exemplo}

    HumanoGuerreiro que vai ser um humano guerreiro basico

    PersonagemPersonalizavel que deixar tudo personalizavel e implementar os outros metodos
    */
}
