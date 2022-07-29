package cn.winebibber.pattern.behaviour.command;

import java.util.Map;

/**
 * @author xujianhu
 * @date 2022-07-29 17:44
 * @Description: 具体命令类
 */
public class OrderCommand implements Command{
    private SeniorChef seniorChef;
    private Order order;

    public OrderCommand(SeniorChef seniorChef, Order order){
        this.seniorChef = seniorChef;
        this.order = order;
    }

    public void execute() {
        System.out.println(order.getDiningTable() + "桌的订单");
        Map<String, Integer> foodDic = order.getFoodDic();
        for (String foodName : foodDic.keySet()) {
            seniorChef.makeFood(foodName,foodDic.get(foodName));
        }
        System.out.println(order.getDiningTable() + "桌的饭做好了");
    }
}
