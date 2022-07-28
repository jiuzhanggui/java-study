package cn.winebibber.pattern.creator.singleton.lazy.demo1;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-24 21:29
 * @Description: 单例模式（懒汉式）--线程不安全方式
 */
public class SingletonLazy {
    // 私有构造
    private SingletonLazy(){}

    // 声明该类 类型的变量
    private static SingletonLazy singletonLazy;

    // 对外提供访问方式
    public static SingletonLazy getSingletonLazy(){
        // 保证只创建一次
        if (singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }
}
