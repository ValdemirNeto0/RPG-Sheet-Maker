package com.patternproject.Controller;

import com.patternproject.Model.CharacterHuman;
import com.patternproject.Model.CharacterSheet;

public class Director {
    //chama um construtor para fazer um humano guerreiro basico
    public CharacterSheet HumanoGuerreiro(){
        CharacterHuman c = new CharacterHuman();
        return c.getCharacter();
    }
}
