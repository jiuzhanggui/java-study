package cn.winebibber.pattern.creator.singleton.hunger.demo1;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-24 21:01
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        SingletonHunger singletonHunger = SingletonHunger.getSingletonHunger();
        SingletonHunger singletonHunger1 = SingletonHunger.getSingletonHunger();

        // 判断两个对象的内存地址是否一致
        System.out.println(singletonHunger == singletonHunger1);
    }
}
