package cn.winebibber.pattern.construction.proxy.jdk_proxy;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-27 10:37
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.tickets();
    }
}
