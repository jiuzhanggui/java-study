package cn.winebibber.pattern.creator.factory.abstract_factory;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-25 18:50
 * @Description: 餐饮工厂
 */
public interface CateringFactory {

    public Coffee createCoffee();

    public Cake createCake();
}
