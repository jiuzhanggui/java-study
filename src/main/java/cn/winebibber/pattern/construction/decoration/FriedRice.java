package cn.winebibber.pattern.construction.decoration;

/**
 * @author xujianhu
 * @date 2022-07-28 10:47
 * @Description: 炒饭类（具体构件角色）
 */
public class FriedRice extends FastFood{

    public FriedRice(){
        super(10.0,"炒饭");
    }

    @Override
    public Double cost() {
        return getPrice();
    }
}
