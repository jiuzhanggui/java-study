package cn.winebibber.pattern.behaviour.visitor;

/**
 * @author 江北的鱼
 * @date 2022/07/30
 * @description: 具体元素角色类
 */
public class Cat implements Animal{
    public void accept(Person person) {
        person.feed(this);
        System.out.println("好好吃，喵");
    }
}
