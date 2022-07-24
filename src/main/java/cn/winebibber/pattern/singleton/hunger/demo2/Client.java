package cn.winebibber.pattern.singleton.hunger.demo2;

/**
 * @author 江北的鱼
 * @email moke917@163.com
 * @date 2022-07-24 21:12
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        SingletonHunger singletonHunger = SingletonHunger.getSingletonHunger();
        SingletonHunger singletonHunger1 = SingletonHunger.getSingletonHunger();

        System.out.println(singletonHunger == singletonHunger1);
    }
}
