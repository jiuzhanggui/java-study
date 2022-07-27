package cn.winebibber.pattern.construction.proxy.jdk_proxy;

import cn.winebibber.pattern.construction.proxy.jdk_proxy.SellTickets;
import cn.winebibber.pattern.construction.proxy.jdk_proxy.TrainTickets;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xujianhu
 * @email moke917@163.com
 * @date 2022-07-27 10:01
 * @Description:
 */
public class ProxyFactory {

    // 1.具体目标对象（具体主题类）
    private TrainTickets trainTickets = new TrainTickets();

    /*
    ClassLoader loader : 类加载器，用于加载代理类，可以通过对目标对象获取类加载器
    Class<?>[] interfaces: 代理类实现的接口的字节码对象
    InvocationHandler h : 代理对象的调用处理程序
    */
    public SellTickets getProxyObject() {
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                trainTickets.getClass().getClassLoader(),
                trainTickets.getClass().getInterfaces(),
                new InvocationHandler() {
                    /*
                    Object proxy:代理对象--和proxyObject是同一个对象，在invoke方法中基本不用
                    Method method:对接口中的方法进行封装的method对象
                    Object[] args: 调用方法的实际参数
                    */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("执行invoke");
                        System.out.println("代理买票点出票");
                        System.out.println("收取服务费用");
                        // 利用反射调用具体主题类中的方法
                        Object invoke = method.invoke(trainTickets, args);
                        return invoke;
                    }
                }
        );
        return proxyObject;
    }
}
