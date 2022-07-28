package cn.winebibber.pattern.construction.facade;

/**
 * @author xujianhu
 * @date 2022-07-28 16:35
 * @Description: 只能家居类（外观角色）
 */
public class SmartAppliancesFacade {
    private Light light;
    private TV tv;

    public SmartAppliancesFacade(){
        this.light = new Light();
        this.tv = new TV();
    }

    public void say(String msg){
        if (msg.contains("打开")){
            on();
        } else if (msg.contains("关闭")) {
            off();
        } else {
            System.out.println("what???");
        }
    }

    private void on(){
        light.on();
        tv.on();
    }
    private void off(){
        light.off();
        tv.off();
    }
}
