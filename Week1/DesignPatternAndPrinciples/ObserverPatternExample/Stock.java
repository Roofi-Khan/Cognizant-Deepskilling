package Week1.DesignPatternAndPrinciples.ObserverPatternExample;

public interface Stock {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
