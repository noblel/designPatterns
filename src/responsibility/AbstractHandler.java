package responsibility;

/**
 * @author Noblel
 */
abstract class AbstractHandler {
    /**
     * 下一节点的处理者
     */
    protected AbstractHandler nextHandler;

    /**
     * 请求处理
     *
     * @param request 请求对象
     */
    public final void handleRequest(AbstractRequest request){
        if (getHandleLevel() == request.getRequestLevel()) {
            //一致则由该处理对象处理
            handle(request);
        } else {
            //否则将该请求对象转发给下一节点上的请求对象
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            } else {
                //当前所有处理者都不能处理
                System.out.println("所有处理者都不能处理");
            }
        }
    }

    /**
     * 获取处理者对象的处理级别
     * @return 处理级别
     */
    protected abstract int getHandleLevel();

    /**
     * 每个处理者对象的具体处理方式
     * @param request 请求者对象
     */
    protected abstract void handle(AbstractRequest request);
}
