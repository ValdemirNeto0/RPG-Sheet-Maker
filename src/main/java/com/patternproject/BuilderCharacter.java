package com.patternproject;

public interface BuilderCharacter {
    //seta as informacoes basicas necessarias
    void setInformacoesBasicas();
    //caracteristicas(forca, destreza,...), pericias e salvaguardas
    void setPontosHabilidades();
    //seta as informacoes de combate
    void setInformacoesCombate(); 
}