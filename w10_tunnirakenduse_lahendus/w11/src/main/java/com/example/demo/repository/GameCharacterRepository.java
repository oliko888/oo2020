package com.example.demo.repository;

import java.util.ArrayList;
/* import java.util.Arrays; */
import java.util.List;

import com.example.demo.model.GameCharacter;

public class GameCharacterRepository {
    static List<GameCharacter> characters = new ArrayList<>();

    public static List<GameCharacter> buildCharacters() {
        characters = List.of(
                new GameCharacter("Oli", 'M', "Goblin"),
                new GameCharacter("Leena", 'N', "Wizard"),
                new GameCharacter("Greg", 'M', "Tank"),
                new GameCharacter("Juhan", 'M', "Goblin")
        );
        /* GameCharacter one = new GameCharacter("Oli", 'M', "Goblin");
        GameCharacter two = new GameCharacter("Leena", 'N', "Wizard");
        GameCharacter three = new GameCharacter("Greg", 'M', "Tank");
        GameCharacter four = new GameCharacter("Juhan", 'M', "Goblin");

        characters = (Arrays.asList(
                one, 
                two, 
                three,
                four
            )); */
            
        return characters;
    }
}