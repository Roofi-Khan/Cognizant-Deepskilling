package Week1.DesignPatternAndPrinciples.AdapterPatternExample;

public class PayPalGateway {

    public void makePayment(double amount) {
        System.out.println("PayPal Payment: " + amount);
    }
}