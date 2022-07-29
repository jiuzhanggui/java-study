package cn.winebibber.pattern.behaviour.command;

/**
 * @author xujianhu
 * @date 2022-07-29 17:44
 * @Description: 厨师类（接收者角色）
 */
public class SeniorChef {
    public void makeFood(String foodName, Integer num){
        System.out.println(num + "份" + foodName);
    }
}
