package proxy.dynamicproxy;


import proxy.IUserDao;
import proxy.UserDao;

/**
 * @author Noblel
 * 动态代理
 */
public class Client {
    public static void main(String[] args) {
        // 目标对象
        IUserDao target = new UserDao();

        // 【原始的类型 class proxy.staticproxy.UserDao】
        System.out.println(target.getClass());

        // class $Proxy0   内存中动态生成的代理对象
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        System.out.println(proxy.getClass());

        //执行方法
        proxy.save();

    }
}
