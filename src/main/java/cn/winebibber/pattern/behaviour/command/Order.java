package cn.winebibber.pattern.behaviour.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xujianhu
 * @date 2022-07-29 17:46
 * @Description: 订单类
 */
public class Order {
    private int diningTable;
    private Map<String,Integer> foodDic = new HashMap<String, Integer>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDic() {
        return foodDic;
    }

    public void setFoodDic(String name, Integer num) {
        this.foodDic.put(name,num);
    }
}
