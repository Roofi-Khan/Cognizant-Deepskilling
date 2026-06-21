package Week1.DesignPatternAndPrinciples.ObserverPatternExample;

public class MobileApp implements Observer {

    @Override
    public void update(double stockPrice) {
        System.out.println("Mobile App Updated: Stock Price = " + stockPrice);
    }
}
