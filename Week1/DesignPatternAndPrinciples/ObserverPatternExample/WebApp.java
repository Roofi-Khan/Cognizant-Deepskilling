package Week1.DesignPatternAndPrinciples.ObserverPatternExample;

public class WebApp implements Observer {

    @Override
    public void update(double stockPrice) {
        System.out.println("Web App Updated: Stock Price = " + stockPrice);
    }
}
