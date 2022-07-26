package cn.winebibber.pattern.factory.static_factory;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-25 15:59
 * @Description: 抽象产品（咖啡）
 */
public abstract class Coffee {

    public abstract String getName();

    public void addMilk(){
        System.out.println("加奶");
    };

    public void addSugar(){
        System.out.println("加糖");
    };

}
