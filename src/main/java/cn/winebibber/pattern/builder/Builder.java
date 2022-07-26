package cn.winebibber.pattern.builder;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-26 19:54
 * @Description: 建造者抽象类
 */
public abstract class Builder {
    protected  Bike bike = new Bike();

    public abstract void builderFrame();

    public abstract void builderSeat();

    public abstract Bike createBike();

    // 将指挥者封装进建造者中
    public Bike construct(){
        this.builderFrame();
        this.builderSeat();
        return this.createBike();
    }
}
