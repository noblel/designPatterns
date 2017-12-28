package visitor;

/**
 * @author Noblel
 */
public class Visitor implements IVisitor {

    @Override
    public void visit(ConcreteElement1 e11) {
        e11.doSomething();
    }

    @Override
    public void visit(ConcreteElement2 e12) {
        e12.doSomething();
    }
}
