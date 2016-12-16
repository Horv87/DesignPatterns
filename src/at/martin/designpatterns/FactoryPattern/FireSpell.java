package at.martin.designpatterns.FactoryPattern;

/**
 * Created by martin on 16.12.16.
 */
public class FireSpell extends Spell {

    public FireSpell (){
        this.damage = 10;
        this.radius = 2.5f;
    }

    @Override
    public void castSpell() {
        System.out.println("Fire Spell casted ");
    }
}
