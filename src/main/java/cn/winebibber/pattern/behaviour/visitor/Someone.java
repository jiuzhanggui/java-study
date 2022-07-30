package cn.winebibber.pattern.behaviour.visitor;

/**
 * @author 江北的鱼
 * @date 2022/07/30
 * @description: 具体访问者角色类
 */
public class Someone implements Person{
    public void feed(Cat cat) {
        System.out.println("其他人喂猫");
    }

    public void feed(Dog dog) {
        System.out.println("其他人喂狗");
    }
}
