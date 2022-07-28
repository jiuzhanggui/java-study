package cn.winebibber.pattern.creator.singleton.destroy.demo2;

import java.lang.reflect.Constructor;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-24 22:43
 * @Description: 破坏单例模式--反射方式
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // 1.获取字节码对象
        Class<SingletonLazy> singletonLazyClass = SingletonLazy.class;
        // 2.获取无参构造方法对象
        Constructor<SingletonLazy> constructor = singletonLazyClass.getDeclaredConstructor();
        // 3.取消访问检查
        constructor.setAccessible(true);
        // 4.创建对象
        SingletonLazy singletonLazy = constructor.newInstance();
        SingletonLazy singletonLazy1 = constructor.newInstance();

        System.out.println(singletonLazy == singletonLazy1);

    }
}
