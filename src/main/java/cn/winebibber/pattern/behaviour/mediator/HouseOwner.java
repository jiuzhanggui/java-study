package cn.winebibber.pattern.behaviour.mediator;

/**
 * @author 江北的鱼
 * @date 2022/07/30
 * @description:
 */
public class HouseOwner extends Person {
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constact(String message) {
        mediator.constact(message, this);
    }

    public void getMessage(String message) {
        System.out.println("房东" + name + "获取信息为：" + message);
    }
}
