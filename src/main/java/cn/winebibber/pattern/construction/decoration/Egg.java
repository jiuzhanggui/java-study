package cn.winebibber.pattern.construction.decoration;

/**
 * @author xujianhu
 * @date 2022-07-28 10:55
 * @Description: 鸡蛋类（具体装饰者类）
 */
public class Egg extends Garnish{

    public Egg(FastFood fastFood){
        super(fastFood, 1.0, "鸡蛋");
    }

    public Egg(FastFood fastFood, Double price, String desc) {
        super(fastFood, price, desc);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }

    @Override
    public Double cost() {
        return getPrice() + getFastFood().cost();
    }

}
