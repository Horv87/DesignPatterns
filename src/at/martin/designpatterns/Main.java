package at.martin.designpatterns;

import at.martin.designpatterns.FactoryPattern.Spell;
import at.martin.designpatterns.FactoryPattern.SpellFactory;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Spell spell = SpellFactory.createSpell(args[0]);
        spell.castSpell();
    }
}
