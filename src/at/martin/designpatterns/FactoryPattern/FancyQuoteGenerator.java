package at.martin.designpatterns.FactoryPattern;

import java.util.ArrayList;

/**
 * Created by martin on 12.12.16.
 */
public class FancyQuoteGenerator extends RandomQuoteGenerator {
    @Override
    public ArrayList<Quote> generateQuotes() {
        ArrayList<Quote> fancyQuoteList = new ArrayList<>();
        fancyQuoteList.add(new FancyQuote());

        return fancyQuoteList;
    }
}
