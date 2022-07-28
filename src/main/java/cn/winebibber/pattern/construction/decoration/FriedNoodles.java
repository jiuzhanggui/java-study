package cn.winebibber.pattern.construction.decoration;

/**
 * @author xujianhu
 * @date 2022-07-28 10:49
 * @Description:
 */
public class FriedNoodles extends FastFood{

    public FriedNoodles(){
        super(11.0, "炒面");
    }

    @Override
    public Double cost() {
        return getPrice();
    }
}
