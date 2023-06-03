package com.patternproject;

public final class Main {
    public static void main(String[] args) {
        Director diretor = new Director();
        CharacterSheet personagem = new CharacterSheet();
        personagem = diretor.HumanoGuerreiro();
        System.out.println(personagem);
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

    ElfoFeiticeiro que vai ser um elfo feiticeiro basico

    PersonagemPersonalizavel que deixar tudo personalizavel e implementar os outros metodos
    */
}
