package responsibility;

/**
 * @author Noblel
 * 处理者2
 */
class ConcreteHandler2 extends AbstractHandler {

    @Override
    protected int getHandleLevel() {
        return 2;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handle2 handle request "
                + request.getRequestLevel());
    }
}
