package singleton;

/**
 * @author Noblel
 *
 * 枚举单例，有效方式反序列化导致实例重新创建
 */
enum  EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("do sth.");
    }
}
