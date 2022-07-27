package cn.winebibber.pattern.construction.proxy.cglib_proxy;


/**
 * @author xujianhu
 * @date 2022-07-27 11:33
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        TrainTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.tickets();
    }
}
