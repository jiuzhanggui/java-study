package cn.winebibber.pattern.creator.factory.static_factory;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-25 16:06
 * @Description: 具体产品（美式咖啡）
 */
public class AmericanCoffee extends Coffee {
    @Override
    public String getName() {
        System.out.println("我是美式咖啡");
       return "我是美式咖啡";
    }
}
