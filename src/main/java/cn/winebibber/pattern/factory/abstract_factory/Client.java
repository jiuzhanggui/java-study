package cn.winebibber.pattern.factory.abstract_factory;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-25 18:58
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        AmericanCateringFactory factory = new AmericanCateringFactory();
//        LtalyCateringFactory factory = new LtalyCateringFactory();

        Cake cake = factory.createCake();
        Coffee coffee = factory.createCoffee();
        cake.show();
        coffee.getName();
    }
}
