package decorator;

/**
 * @author Noblel
 * 抽象装饰者
 */
abstract class Decorator extends Component {
    /**
     * 持有一个Component对象
     */
    private Component mComponent;

    public Decorator(Component component) {
        mComponent = component;
    }

    @Override
    public void operate() {
        mComponent.operate();
    }
}
