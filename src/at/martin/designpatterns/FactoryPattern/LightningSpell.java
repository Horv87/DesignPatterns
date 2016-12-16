package at.martin.designpatterns.FactoryPattern;

/**
 * Created by martin on 16.12.16.
 */
public class LightningSpell extends Spell {

    public LightningSpell() {
        this.damage = 15;
        this.radius = 1.5f;
    }
    @Override
    public void castSpell() {
        System.out.println("Lightning Spell casted");
    }
}
