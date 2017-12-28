package observer;

/**
 * @author Noblel
 * 观察者模式
 */
class Client {
    public static void main(String[] args) {
        SubscriptionSubject subject = new SubscriptionSubject();
        User user1 = new User("Noblel");
        User user2 = new User("Tony");
        User user3 = new User("Tom");
        //添加观察者
        subject.attach(user1);
        subject.attach(user2);
        subject.attach(user3);

        subject.notifyObserver("接受到新消息了");

        subject.detach(user2);

        subject.notifyObserver("接受到新消息了");

    }
}
