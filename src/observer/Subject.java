package observer;

/**
 * @author Noblel
 *
 * 抽象被观察者
 */
interface Subject {

    /**
     * 增加观察者
     * @param observer 观察者
     */
    void attach(Observer observer);

    /**
     * 删除观察者
     * @param observer 观察者
     */
    void detach(Observer observer);

    /**
     * 通知订阅者更新消息
     * @param mgs 更新的消息
     */
    void notifyObserver(String mgs);
}
