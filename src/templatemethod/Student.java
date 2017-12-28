package templatemethod;

/**
 * @author Noblel
 */
public class Student extends AbstractPerson {
    @Override
    protected void takeThings() {
        System.out.println("穿校服");
    }

    @Override
    protected void eatBreakfast() {
        System.out.println("吃早饭");
    }

    @Override
    protected void dressUp() {
        System.out.println("拿好书本去学校");
    }
}
