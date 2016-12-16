# Factory Pattern Example

In this example we have a **SpellFactory** which
can create three different kind of magic spells.

## About
The Factory Pattern uses inheritance to delegate object creation via methods to subclasses.
[For details see Wikipedia](https://en.wikipedia.org/wiki/Factory_method_pattern)
## Advantages

* Complex object creation is now handled by sub-classes.
* Additional sub-classes can be added without much trouble.



## Example Structure

**Spell.java** is the abstract base class for all other spell types.

**IceSpell.java** inherits from `Spell.java` - concrete implementation of an spell

**FireSpell.java** inherits from `Spell.java` - concrete implementation of an spell

**LightningSpell.java** inherits from `Spell.java` - concrete implementation of an spell

**SpellFactory.java** contains a static factory method `createSpell(String type)` with logic to
determine which kind of spell object should be created based on a given input.
