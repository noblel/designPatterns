package mediator;

/**
 * @author Noblel
 */
public class Client2 {
    public static void main(String[] args) {
        AbstractColleague2 collA = new ColleagueA2();
        AbstractColleague2 collB = new ColleagueB2();

        AbstractMediator mediator = new Mediator(collA, collB);

        System.out.println("--通过设置A影响B--");
        collA.setNumber(1000, mediator);
        System.out.println("collA的number值为：" + collA.getNumber());
        System.out.println("collB的number值为A的100倍：" + collB.getNumber());

        System.out.println("==========通过设置B影响A==========");
        collB.setNumber(1000, mediator);
        System.out.println("collB的number值为：" + collB.getNumber());
        System.out.println("collA的number值为B的0.01倍：" + collA.getNumber());
    }
}
