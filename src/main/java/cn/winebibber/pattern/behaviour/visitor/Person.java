package cn.winebibber.pattern.behaviour.visitor;

/**
 * @author 江北的鱼
 * @date 2022/07/30
 * @description: 抽象访问者角色类
 */
public interface Person {
    // 喂狗
    public void feed(Cat cat);
    //喂猫
    public void feed(Dog dog);
}
