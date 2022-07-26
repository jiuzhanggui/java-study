package cn.winebibber.pattern.factory.simple_factory;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-25 16:07
 * @Description: 具体产品（拿铁咖啡）
 */
public class LatteCoffee extends Coffee{
    @Override
    public String getName() {
        System.out.println("我是拿铁咖啡");
        return "我是拿铁咖啡";
    }
}
