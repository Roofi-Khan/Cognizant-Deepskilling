package Week1.DesignPatternAndPrinciples.FactoryMethodPatternExample;

public class FactoryTest {

    public static void main(String[] args) {

        DocumentFactory wordFactory = new WordFactory();
        DocumentFactory pdfFactory = new PdfFactory();
        DocumentFactory excelFactory = new ExcelFactory();

        wordFactory.createDocument().open();
        pdfFactory.createDocument().open();
        excelFactory.createDocument().open();
    }
}
