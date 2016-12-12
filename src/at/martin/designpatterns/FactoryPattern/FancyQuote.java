package at.martin.designpatterns.FactoryPattern;

/**
 * Created by martin on 12.12.16.
 */
public class FancyQuote extends Quote {
    @Override
    public String randomQuote() {
        return "Fancy Quote - Fancy Quote Author";
    }
}
