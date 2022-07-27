package cn.winebibber.pattern.construction.proxy.cglib_proxy;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author xujianhu
 * @date 2022-07-27 11:24
 * @Description: 代理对象工厂，用于获取代理对象
 */
public class ProxyFactory implements MethodInterceptor {

    // 声明目标对象
    private TrainTickets trainTickets = new TrainTickets();

    public TrainTickets getProxyObject(){
        // 1.创建Enhancer对象，类似于JDK代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        // 2.设置父类的字节码对象
        enhancer.setSuperclass(TrainTickets.class);
        // 3.设置回调函数
        enhancer.setCallback(this);
        // 4.创建代理对象
        TrainTickets proxyObject = (TrainTickets) enhancer.create();
        return proxyObject;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 代理增强
        System.out.println("代理买票点出票");
        System.out.println("收取服务费用");

        // 利用反射调用目标对象方法
        Object invoke = method.invoke(trainTickets, objects);
        return invoke;
    }
}
