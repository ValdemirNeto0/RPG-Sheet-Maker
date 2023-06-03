package com.patternproject;

import java.util.ArrayList;

public interface BuilderCharacter {
    //seta as informacoes basicas necessarias
    void setInformacoesBasicas(int xp, int level, ArrayList<String> informacoesBasicas);
    //caracteristicas(forca, destreza,...), pericias e salvaguardas
    void setPontosHabilidades(ArrayList<Integer> caracteristicas, ArrayList<Integer> pericias,
    ArrayList<Integer> salvaguarda);
    //seta as informacoes de combate
    void setInformacoesCombate(ArrayList<Integer> informacoesCombate); 
}