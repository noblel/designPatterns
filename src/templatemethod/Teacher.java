package templatemethod;

/**
 * @author Noblel
 */
public class Teacher extends AbstractPerson {
    @Override
    protected void takeThings() {
        System.out.println("穿工作服");
    }

    @Override
    protected void eatBreakfast() {
        System.out.println("做早饭");
    }

    @Override
    protected void dressUp() {
        System.out.println("带上昨晚准备的考卷");
    }
}
