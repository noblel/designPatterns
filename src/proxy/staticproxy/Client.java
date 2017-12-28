package proxy.staticproxy;

import proxy.UserDao;

/**
 * @author Noblel
 * 静态代理
 */
public class Client {
    public static void main(String[] args) {
        //目标对象
        UserDao target = new UserDao();

        //代理对象,把目标对象传给代理对象,建立代理关系
        UserDaoProxy proxy = new UserDaoProxy(target);

        //执行代理方法
        proxy.save();
    }
}
