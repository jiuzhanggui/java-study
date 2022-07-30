package cn.winebibber.pattern.behaviour.mediator;

/**
 * @author 江北的鱼
 * @date 2022/07/30
 * @description: 抽象同事类
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
