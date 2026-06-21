package Week1.DesignPatternAndPrinciples.ProxyPatternExample;

public class ProxyTest {

    public static void main(String[] args) {

        Image image = new ProxyImage("nature.jpg");

        System.out.println("First Call:");
        image.display();

        System.out.println("\nSecond Call:");
        image.display();
    }
}
