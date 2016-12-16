package at.martin.designpatterns.FactoryPattern;

/**
 * Created by martin on 16.12.16.
 */
public abstract class Spell {
    protected int damage;
    protected float radius;

    public Spell(){

    }


    public abstract void  castSpell ();
}
