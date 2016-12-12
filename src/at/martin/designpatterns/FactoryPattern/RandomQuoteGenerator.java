package at.martin.designpatterns.FactoryPattern;

import java.util.ArrayList;

/**
 * Created by martin on 12.12.16.
 */
public abstract class RandomQuoteGenerator {
        private ArrayList<Quote> quoteList;

    public RandomQuoteGenerator() {
        this.quoteList = generateQuotes();

    }

    public abstract ArrayList<Quote> generateQuotes();


    public void print () {
            System.out.println(this.quoteList.get(0));
    }
}
