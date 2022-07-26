package cn.winebibber.pattern.builder;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-26 20:02
 * @Description: 具体创建者
 */
public class MeiTuanBuilder extends Builder{
    @Override
    public void builderFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void builderSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
