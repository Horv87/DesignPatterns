package at.martin.designpatterns.FactoryPattern;

import java.util.ArrayList;

/**
 * Created by martin on 12.12.16.
 */
public class SimpleQuoteGenerator extends RandomQuoteGenerator {
    @Override
    public ArrayList<Quote> generateQuotes() {
        ArrayList<Quote> simpleQuotes = new ArrayList<>();
        simpleQuotes.add(new SimpleQuote());

        return simpleQuotes;
    }
}
