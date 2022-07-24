package cn.winebibber.pattern.singleton.lazy.demo4;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-24 22:00
 * @Description: 单例模式（懒汉式）--静态内部类模式
 */
public class SingletonLazy {

    private SingletonLazy(){}

    private static class SingletonLazyHolder{
        public static final SingletonLazy SINGLETON_LAZY = new SingletonLazy();
    }

    public static SingletonLazy getInstance(){
        return SingletonLazyHolder.SINGLETON_LAZY;
    }
}
