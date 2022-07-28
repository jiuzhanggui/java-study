package cn.winebibber.pattern.construction.decoration;

/**
 * @author xujianhu
 * @date 2022-07-28 11:01
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        FastFood friedRice = new FriedRice();
        System.out.println(friedRice.getDesc() + friedRice.cost());

        System.out.println("---------------");

        friedRice = new Egg(friedRice);
        System.out.println(friedRice.getDesc() + friedRice.cost());

        System.out.println("---------------");

        friedRice = new Bacon(friedRice);

        System.out.println(friedRice.getDesc() + friedRice.cost());

        System.out.println("---------------");

    }
}
