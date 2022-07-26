package cn.winebibber.pattern.factory.simple_factory;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-25 16:16
 * @Description:
 */
public class CoffeeStore {
    public Coffee orderCoffee(Integer type){
        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
        Coffee coffee = simpleCoffeeFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
