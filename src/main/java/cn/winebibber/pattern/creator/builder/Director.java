package cn.winebibber.pattern.creator.builder;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-26 20:03
 * @Description: 指挥者
 */
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Bike construct(){
        builder.builderFrame();
        builder.builderSeat();
        return builder.createBike();
    }
}
