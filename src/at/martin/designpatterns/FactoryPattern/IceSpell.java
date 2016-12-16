package at.martin.designpatterns.FactoryPattern;

/**
 * Created by martin on 16.12.16.
 */
public class IceSpell extends Spell {

    public IceSpell (){
        this.radius = 0;
        this.damage = 20;
    }

    @Override
    public void castSpell() {
        System.out.println("Ice Spell casted");
    }
}
