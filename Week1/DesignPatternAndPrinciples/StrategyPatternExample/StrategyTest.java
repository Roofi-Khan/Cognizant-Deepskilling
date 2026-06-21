package Week1.DesignPatternAndPrinciples.StrategyPatternExample;

public class StrategyTest {

    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.executePayment(5000);

        context.setStrategy(new PayPalPayment());
        context.executePayment(3000);
    }
}
