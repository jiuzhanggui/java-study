package cn.winebibber.pattern.behaviour.visitor;

/**
 * @author 江北的鱼
 * @date 2022/07/30
 * @description: 抽象元素角色类
 */
public interface Animal {
    public void accept(Person person);
}
