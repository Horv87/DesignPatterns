# Factory Pattern Example

In this example we have a non-function **Random Quote Generator** which
can show quotes in **simple** or **fancy** mode.

## About
The Factory Pattern uses inheritance to delegate object creation via methods to subclasses.
[For details see Wikipedia](https://en.wikipedia.org/wiki/Factory_method_pattern)
## Advantages

* Complex object creation is now be handled by sub-classes.
* Additional sub-classes can be added without much trouble.



## Example Structure

**RandomQuoteGenerator.java** is an abstract class that leaves the implementation
of the `generateQuotes()` method to its sub-classes.

**Quote.java** is the abstract class that we uses as a template. Again implementation is
left for the sub-classes

**SimpleQuote.java** inherits from _Quote.java_ and contains concrete implementation.

**FancyQuote.java** inherits from _Quote.java_ and contains concrete implementation.

**SimpleQuoteGenerator.java** inherits from _RandomQuoteGenerator_. Its `generateQuotes()`
method creates a new _SimpleQuote_ Object.

**FancyQuoteGenerator.java** inherits from _RandomQuoteGenerator_. Its `generateQuotes()`
method creates a new _FancQuote_ Object.