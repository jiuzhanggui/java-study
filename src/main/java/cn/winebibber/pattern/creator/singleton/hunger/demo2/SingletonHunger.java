package cn.winebibber.pattern.creator.singleton.hunger.demo2;

/**
 * @author 江北的鱼
 * @email moke917@163.com
 * @date 2022-07-24 21:08
 * @Description: 单例模式（饿汉式）--静态代码块方式
 */
public class SingletonHunger {
    private SingletonHunger(){}

    // 默认为null
    private static SingletonHunger singletonHunger;

    static {
        singletonHunger = new SingletonHunger();
    }

    // 对外方法
    public static SingletonHunger getSingletonHunger(){
        return singletonHunger;
    }
}
