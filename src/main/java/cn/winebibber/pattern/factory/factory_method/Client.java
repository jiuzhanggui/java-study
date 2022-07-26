package cn.winebibber.pattern.factory.factory_method;


/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-25 17:33
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        SimpleCoffeeFactory americanCoffeeFactory = new AmericanCoffeeFactory();
        coffeeStore.setCoffeeFactory(americanCoffeeFactory);
        Coffee coffee = coffeeStore.orderCoffee();
        coffee.getName();
    }
}
