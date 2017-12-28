package mediator;

/**
 * @author Noblel
 */
public abstract class AbstractMediator {
    protected AbstractColleague2 A;
    protected AbstractColleague2 B;

    public AbstractMediator(AbstractColleague2 a, AbstractColleague2 b) {
        A = a;
        B = b;
    }

    public abstract void aAffectB();

    public abstract void bAffectA();

}
