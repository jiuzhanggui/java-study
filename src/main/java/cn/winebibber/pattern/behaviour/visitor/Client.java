package cn.winebibber.pattern.behaviour.visitor;

/**
 * @author 江北的鱼
 * @date 2022/07/30
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        home.add(new Cat());
        home.add(new Dog());

        Owner owner = new Owner();
        home.action(owner);

        Someone someone = new Someone();
        home.action(someone);

    }
}
