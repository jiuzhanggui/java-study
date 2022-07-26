package cn.winebibber.pattern.factory.factory_method;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-25 17:17
 * @Description:
 */
public class AmericanCoffeeFactory implements SimpleCoffeeFactory {
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
