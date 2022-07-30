package cn.winebibber.pattern.behaviour.observer;

/**
 * @author 江北的鱼
 * @date 2022-07-30 17:46
 * @Description: 抽象主题类
 */
public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notify(String message);
}
