package cn.winebibber.pattern.behaviour.command;

/**
 * @author xujianhu
 * @date 2022-07-29 17:58
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        // 创建订单
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFoodDic("土豆丝", 1);
        order1.setFoodDic("可乐",1);

        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFoodDic("老干妈拌饭", 1);
        order2.setFoodDic("可乐",2);

        // 创建厨师
        SeniorChef seniorChef = new SeniorChef();

        // 创建命令
        OrderCommand orderCommand1 = new OrderCommand(seniorChef, order1);
        OrderCommand orderCommand2 = new OrderCommand(seniorChef, order2);
        orderCommand1.execute();
        orderCommand2.execute();
    }
}
