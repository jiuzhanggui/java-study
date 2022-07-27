package cn.winebibber.pattern.construction.proxy.static_proxy;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-27 09:46
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        ProxyTickets proxyTickets = new ProxyTickets();
        proxyTickets.tickets();
    }
}
