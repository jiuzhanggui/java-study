package cn.winebibber.pattern.creator.singleton.lazy.demo4;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-24 22:02
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        SingletonLazy instance = SingletonLazy.getInstance();
        SingletonLazy instance1 = SingletonLazy.getInstance();

        System.out.println(instance == instance1);
    }
}
