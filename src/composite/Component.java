package composite;

/**
 * @author Noblel
 */
public abstract class Component {
    String name;

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void eachChild();
}
