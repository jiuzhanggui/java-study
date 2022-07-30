package cn.winebibber.pattern.behaviour.observer;

/**
 * @author 江北的鱼
 * @date 2022/07/30
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subject = new SubscriptionSubject();

        subject.attach(new WerxinUser("阿飞"));
        subject.attach(new WerxinUser("小明"));
        subject.attach(new WerxinUser("小黑"));

        subject.notify("更新啦");
    }
}
