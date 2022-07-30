package cn.winebibber.pattern.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 江北的鱼
 * @date 2022-07-30 17:49
 * @Description: 具体主题类
 */
public class SubscriptionSubject implements Subject {
    private List<Observer> weixinUserList = new ArrayList<Observer>();

    public void attach(Observer observer) {
        weixinUserList.add(observer);
    }

    public void detach(Observer observer) {
        weixinUserList.remove(observer);
    }

    public void notify(String message) {
        for (Observer observers : weixinUserList) {
            observers.update(message);
        }
    }
}
