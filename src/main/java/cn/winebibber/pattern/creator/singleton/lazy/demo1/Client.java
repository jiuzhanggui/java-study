package cn.winebibber.pattern.creator.singleton.lazy.demo1;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-24 21:34
 * @Description: 
 */
public class Client {
    public static void main(String[] args) {
        SingletonLazy singletonLazy = SingletonLazy.getSingletonLazy();
        SingletonLazy singletonLazy1 = SingletonLazy.getSingletonLazy();

        System.out.println(singletonLazy == singletonLazy1);
    }
}
