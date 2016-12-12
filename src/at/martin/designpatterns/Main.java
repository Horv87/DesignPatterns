package at.martin.designpatterns;

import at.martin.designpatterns.FactoryPattern.FancyQuoteGenerator;
import at.martin.designpatterns.FactoryPattern.RandomQuoteGenerator;
import at.martin.designpatterns.FactoryPattern.SimpleQuoteGenerator;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here

        HashMap<String,RandomQuoteGenerator> hashMap = new HashMap<>();
        hashMap.put("Simple",new SimpleQuoteGenerator());
        hashMap.put("Fancy",new FancyQuoteGenerator());

        RandomQuoteGenerator generator = hashMap.get(args[0]);
        generator.print();
    }
}
