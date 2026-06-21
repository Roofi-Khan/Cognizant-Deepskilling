package Week1.DesignPatternAndPrinciples.FactoryMethodPatternExample;

public class WordFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
