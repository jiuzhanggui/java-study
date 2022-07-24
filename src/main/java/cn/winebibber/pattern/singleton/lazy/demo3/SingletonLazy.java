package cn.winebibber.pattern.singleton.lazy.demo3;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-24 21:47
 * @Description: 单例模式（懒汉式）--双重检查锁方式
 */
public class SingletonLazy {
    private SingletonLazy() {}

    private static volatile SingletonLazy singletonLazy;

    public static SingletonLazy getSingletonLazy() {
        // 第一次判断判断，如果singletonLazy不为null，则不需要抢占锁，直接返回该对象
        if (singletonLazy == null){
            synchronized (SingletonLazy.class) {
                // 第二次判断，如果singletonLazy为null
                if (singletonLazy == null) {
                    singletonLazy = new SingletonLazy();
                }
            }
        }
        return singletonLazy;
    }
}
