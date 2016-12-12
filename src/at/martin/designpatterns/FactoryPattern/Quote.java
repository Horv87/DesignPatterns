package at.martin.designpatterns.FactoryPattern;

/**
 * Created by martin on 12.12.16.
 */
public abstract class Quote {
    private String quote;
    public Quote() {
        this.quote = randomQuote();

    }

    public abstract String randomQuote();

    @Override
    public String toString (){
        return this.quote;
    }
}
