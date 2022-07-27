package cn.winebibber.pattern.construction.proxy.jdk_proxy;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-27 09:44
 * @Description: 具体的卖票主题类（火车站卖票）
 */
public class TrainTickets implements SellTickets {
    public void tickets() {
        System.out.println("火车站出票");
    }
}
