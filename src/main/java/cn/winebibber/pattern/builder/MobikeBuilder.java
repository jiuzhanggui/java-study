package cn.winebibber.pattern.builder;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-26 20:00
 * @Description: 具体创建者
 */
public class MobikeBuilder extends Builder{
    @Override
    public void builderFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void builderSeat() {
        bike.setSeat("无车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
