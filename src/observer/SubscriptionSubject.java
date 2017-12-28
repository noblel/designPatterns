package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Noblel
 */
class SubscriptionSubject implements Subject{

    /**
     * 观察者集合
     */
    private List<Observer> mObservers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        mObservers.remove(observer);
    }

    @Override
    public void notifyObserver(String msg) {
        for (Observer observer : mObservers) {
            observer.update(msg);
        }
    }
}
