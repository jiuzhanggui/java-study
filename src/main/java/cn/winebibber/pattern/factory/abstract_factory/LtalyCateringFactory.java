package cn.winebibber.pattern.factory.abstract_factory;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-25 18:55
 * @Description: 意大利风味工厂
 */
public class LtalyCateringFactory implements CateringFactory {
    static {
        System.out.println("意大利风味工厂负责生产：");
    }
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    public Cake createCake() {
        return new TiramisuCake();
    }
}
