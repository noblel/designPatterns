package singleton;

/**
 * @author Noblel
 * 懒汉式(线程安全)单例模式,没有synchronized是不安全的
 */
class LazySingleton {
    /**
     * Java1.5以后需要使用volatile关键字保证实例从主存中读取
     */
    private volatile static LazySingleton INSTANCE;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (LazySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazySingleton();
                }
            }
        }
        return INSTANCE;
    }
}
