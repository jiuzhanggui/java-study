package cn.winebibber.pattern.creator.factory.abstract_factory;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-25 18:53
 * @Description: 美式风味的餐饮工厂
 */
public class AmericanCateringFactory implements CateringFactory{
    static {
        System.out.println("美式风味工厂负责生产");
    }
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    public Cake createCake() {
        return new BrownieCake();
    }
}
