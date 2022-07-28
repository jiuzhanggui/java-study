package cn.winebibber.pattern.creator.singleton.hunger.demo1;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-24 20:54
 * @Description: 单例模式（饿汉式）--静态变量方式
 */
public class SingletonHunger {
    private SingletonHunger(){};

    // 直接内部初始化new
    private static SingletonHunger singletonHunger = new SingletonHunger();

    // 对外方法
    public static SingletonHunger getSingletonHunger(){
        return singletonHunger;
    }
}
