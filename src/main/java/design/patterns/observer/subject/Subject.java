package design.patterns.observer.subject;

import design.patterns.observer.observer.Observer;

/**
 * 主题接口
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
