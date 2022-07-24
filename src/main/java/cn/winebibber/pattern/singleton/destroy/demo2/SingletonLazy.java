package cn.winebibber.pattern.singleton.destroy.demo2;

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

//    // 利用反射破坏单例的解决方案：
//
//    private static boolean flag = false;
//
//    private SingletonLazy(){
//        // 解决多线程问题
//        synchronized (SingletonLazy.class) {
//            // 通过判断flag是否为true来进行是否第一次访问的判断
//            if (flag) {
//                // 非第一次访问,直接抛出异常，进行警告
//                throw new RuntimeException("禁止创建多个对象");
//            }
//            // 第一次访问
//            flag =true;
//        }
//    }
//
//    private static class SingletonLazyHolder{
//        public static final SingletonLazy SINGLETON_LAZY = new SingletonLazy();
//    }
//
//    public static SingletonLazy getInstance(){
//        return SingletonLazyHolder.SINGLETON_LAZY;
//    }
}
