package singleton;

/**
 * @author Noblel
 * 登记式单例模式
 * 如果在构造函数中抛出异常，实例将永远得不到创建，也会出错。
 */
class RegSingleton {
    private RegSingleton() {
    }

    private static class SingletonFactory {
        private static final RegSingleton INSTANCE = new RegSingleton();
    }

    public static RegSingleton getInstance() {
        return SingletonFactory.INSTANCE;
    }

    /**
     * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
     */
    public Object readResolve() {
        return getInstance();
    }
}
