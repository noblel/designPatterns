package mediator;

/**
 * @author Noblel
 */
public class Mediator extends AbstractMediator {
    public Mediator(AbstractColleague2 a, AbstractColleague2 b) {
        super(a, b);
    }

    /**
     * 处理A对B的影响
     */
    @Override
    public void aAffectB() {
        int number = A.getNumber();
        B.setNumber(number*100);
    }

    /**
     * 处理B对A的影响
     */
    @Override
    public void bAffectA() {
        int number = B.getNumber();
        A.setNumber(number/100);
    }
}
