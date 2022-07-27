package cn.winebibber.pattern.construction.proxy.static_proxy;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-27 09:44
 * @Description: 代理类（代理商卖票）
 */
public class ProxyTickets implements SellTickets{
    private TrainTickets trainTickets = new TrainTickets();

    public void tickets() {
        System.out.println("代理买票点出票");
        System.out.println("收取服务费用");
        trainTickets.tickets();
    }
}
