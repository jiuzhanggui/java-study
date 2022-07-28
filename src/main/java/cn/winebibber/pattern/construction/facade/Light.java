package cn.winebibber.pattern.construction.facade;

/**
 * @author xujianhu
 * @date 2022-07-28 16:32
 * @Description: 电灯类（子系统角色）
 */
public class Light {
    public void on(){
        System.out.println("开灯");
    }
    public void off(){
        System.out.println("关灯");
    }
}
