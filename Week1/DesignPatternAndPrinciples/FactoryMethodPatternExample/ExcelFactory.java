package Week1.DesignPatternAndPrinciples.FactoryMethodPatternExample;

public class ExcelFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
