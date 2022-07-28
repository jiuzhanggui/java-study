package cn.winebibber.pattern.construction.decoration;

/**
 * @author xujianhu
 * @date 2022-07-28 10:55
 * @Description: 培根类（具体装饰者类）
 */
public class Bacon extends Garnish{

    public Bacon(FastFood fastFood){
        super(fastFood, 2.0, "培根");
    }

    public Bacon(FastFood fastFood, Double price, String desc) {
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
