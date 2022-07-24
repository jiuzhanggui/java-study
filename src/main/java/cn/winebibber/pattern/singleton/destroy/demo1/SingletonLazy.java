package cn.winebibber.pattern.singleton.destroy.demo1;

import java.io.Serializable;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-24 22:00
 * @Description: 单例模式（懒汉式）--静态内部类模式
 */
public class SingletonLazy implements Serializable {

    private SingletonLazy(){}

    private static class SingletonLazyHolder{
        public static final SingletonLazy SINGLETON_LAZY = new SingletonLazy();
    }

    public static SingletonLazy getInstance(){
        return SingletonLazyHolder.SINGLETON_LAZY;
    }

    // 当进行反序列化时，会自动调用该方法，将该方法的值直接返回。
    public Object readResolve(){
        return SingletonLazyHolder.SINGLETON_LAZY;
    }
}
