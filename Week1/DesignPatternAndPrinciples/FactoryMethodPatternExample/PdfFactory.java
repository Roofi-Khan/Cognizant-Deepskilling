package Week1.DesignPatternAndPrinciples.FactoryMethodPatternExample;

public class PdfFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
