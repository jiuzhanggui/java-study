package cn.winebibber.pattern.builder;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-26 20:06
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new MobikeBuilder());
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());


        // 无指挥者者
        MeiTuanBuilder meiTuanBuilder = new MeiTuanBuilder();
        meiTuanBuilder.construct();
        Bike bike1 = meiTuanBuilder.createBike();
        System.out.println(bike1.getFrame());
        System.out.println(bike1.getSeat());

    }
}
