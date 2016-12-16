package at.martin.designpatterns.FactoryPattern;

/**
 * Created by martin on 16.12.16.
 */
public class SpellFactory {


    public static Spell createSpell(String type){

        switch (type){
            case "Fire":
                return new FireSpell();
            case "Ice":
                return new IceSpell();
            case "Lightning":
                return new LightningSpell();
            default:
                return new FireSpell();
        }



    }
}
