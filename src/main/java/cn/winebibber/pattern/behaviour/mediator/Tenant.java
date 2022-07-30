package cn.winebibber.pattern.behaviour.mediator;

/**
 * @author 江北的鱼
 * @date 2022/07/30
 * @description: 租户（具体同事类）
 */
public class Tenant extends Person {
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constact(String message) {
        mediator.constact(message, this);
    }

    public void getMessage(String message) {
        System.out.println("租客" + name + "获取信息为：" + message);
    }
}
