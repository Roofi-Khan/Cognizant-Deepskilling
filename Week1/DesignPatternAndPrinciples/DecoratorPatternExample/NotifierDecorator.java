package Week1.DesignPatternAndPrinciples.DecoratorPatternExample;

public abstract class NotifierDecorator
        implements Notifier {

    protected Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }
}

