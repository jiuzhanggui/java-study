package cn.winebibber.pattern.factory.static_factory;


/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-25 16:16
 * @Description:
 */
public class CoffeeStore {
    public Coffee orderCoffee(Integer type){
        Coffee coffee = StaticCoffeeFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
