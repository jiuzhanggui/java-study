package cn.winebibber.pattern.behaviour.strategy;

/**
 * @author xujianhu
 * @date 2022-07-29 17:04
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();

        SalesMan salesManB = new SalesMan(new StrategyB());
        salesManB.salesManShow();
    }
}
