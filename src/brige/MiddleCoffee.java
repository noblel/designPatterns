package brige;

/**
 * @author Noblel
 * 中杯咖啡
 */
class MiddleCoffee extends Coffee {
    public MiddleCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("中杯" + impl.addSomething() + "咖啡");
    }
}
