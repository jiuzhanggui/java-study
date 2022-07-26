package cn.winebibber.pattern.factory.config_factory;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-26 09:34
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        ConfigCoffeeFactory configCoffeeFactory = new ConfigCoffeeFactory();
        Coffee americanCoffee = configCoffeeFactory.createCoffee("americanCoffee");
        americanCoffee.getName();
        System.out.println("-------------------------");
        Coffee latteCoffee = configCoffeeFactory.createCoffee("latteCoffee");
        latteCoffee.getName();


    }
}
