package cn.winebibber.pattern.construction.facade;

/**
 * @author xujianhu
 * @date 2022-07-28 16:32
 * @Description: 电视机类（子系统角色）
 */
public class TV {
    public void on(){
        System.out.println("打开电视机");
    }
    public void off(){
        System.out.println("关闭电视机");
    }
}
