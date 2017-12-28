package responsibility;

/**
 * @author Noblel
 */
abstract class AbstractRequest {
    /**
     * 处理对象
     */
    private Object obj;

    public AbstractRequest(Object obj) {
        this.obj = obj;
    }

    /**
     * 获取处理的内容对象
     *
     * @return 具体的内容对象
     */
    public Object getContnet() {
        return obj;
    }

    /**
     * 获取请求级别
     *
     * @return 请求级别
     */
    public abstract int getRequestLevel();
}
