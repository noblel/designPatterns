package brige;

/**
 * @author Noblel
 * 桥接模式
 */
class Client {
    public static void main(String[] args) {
        //原味
        Ordinary ordinary = new Ordinary();

        //糖类
        Sugar sugar = new Sugar();

        //中杯原味
        MiddleCoffee middleCoffee = new MiddleCoffee(ordinary);
        middleCoffee.makeCoffee();

        //中杯加糖
        MiddleCoffee middleCoffeeSugar = new MiddleCoffee(sugar);
        middleCoffeeSugar.makeCoffee();

    }
}
