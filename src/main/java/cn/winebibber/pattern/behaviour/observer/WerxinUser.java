package cn.winebibber.pattern.behaviour.observer;

/**
 * @author 江北的鱼
 * @date 2022-07-30 17:50
 * @description: 具体观察者
 */
public class WerxinUser implements Observer {
    private String name;

    public void update(String message) {
        System.out.println(name + message );
    }

    public WerxinUser(String name) {
        this.name = name;
    }
}
