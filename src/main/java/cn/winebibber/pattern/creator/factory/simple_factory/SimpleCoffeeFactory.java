package cn.winebibber.pattern.creator.factory.simple_factory;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-25 16:07
 * @Description: 简单工厂（咖啡工厂）
 */
public class SimpleCoffeeFactory {

    public Coffee createCoffee(Integer type) {
        Coffee coffee;
        if (1 == type) {
            coffee = new AmericanCoffee();
            coffee.getName();
        } else if (2 == type) {
            coffee = new LatteCoffee();
            coffee.getName();
        }else {
            throw new RuntimeException("本店没有你需要的咖啡种类");
        }

        return coffee;
    }
}
