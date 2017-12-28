package mediator;

/**
 * @author Noblel
 */
public class ColleagueB2 extends AbstractColleague2 {
    @Override
    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.bAffectA();
    }
}
