package responsibility;

/**
 * @author Noblel
 * 处理者2
 */
class ConcreteHandler3 extends AbstractHandler {

    @Override
    protected int getHandleLevel() {
        return 3;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handle3 handle request "
                + request.getRequestLevel());
    }
}
