package decorator;

/**
 * @author Noblel
 */
class ConcreteDecoratorA extends Decorator {
    protected ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        operateA();
        super.operate();
        operateB();
    }

    /**
     * 自定义装饰方法A
     */
    private void operateA() {
        //装饰方法逻辑
        System.out.println("装饰方法A");
    }

    /**
     * 自定义装饰方法B
     */
    private void operateB() {
        //装饰方法逻辑
        System.out.println("装饰方法B");
    }
}
