package responsibility;

/**
 * @author Noblel
 * 处理者1
 */
class ConcreteHandler1 extends AbstractHandler {

    @Override
    protected int getHandleLevel() {
        return 1;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handle1 handle request "
                + request.getRequestLevel());
    }
}
