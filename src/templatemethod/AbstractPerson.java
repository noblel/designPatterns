package templatemethod;

/**
 * @author Noblel
 */
public abstract class AbstractPerson {

    public final void prepareGotoSchool(){
        dressUp();
        eatBreakfast();
        takeThings();
    }

    /**
     * 带东西
     */
    protected abstract void takeThings();

    /**
     * 吃早饭
     */
    protected abstract void eatBreakfast();

    /**
     * 最后准备
     */
    protected abstract void dressUp();
}
