package visitor;

/**
 * @author Noblel
 */
public class ConcreteElement1 extends AbstractElement{
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void doSomething() {
        System.out.println("这是元素1");
    }
}
