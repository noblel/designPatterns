package visitor;

/**
 * @author Noblel
 */
public abstract class AbstractElement {
    public abstract void accept(IVisitor visitor);

    public abstract void doSomething();
}
