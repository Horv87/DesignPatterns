package at.martin.designpatterns.FactoryPattern;

/**
 * Created by martin on 12.12.16.
 */
public class SimpleQuote extends Quote {
    @Override
    public String randomQuote() {
        return "Simple quote";
    }
}
