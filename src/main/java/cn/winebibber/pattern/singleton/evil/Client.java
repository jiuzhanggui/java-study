package cn.winebibber.pattern.singleton.evil;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-24 22:15
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.SINGLETON;
        Singleton singleton1 = Singleton.SINGLETON;

        System.out.println(singleton == singleton1);
    }
}
