package cn.winebibber.pattern.construction.facade;

/**
 * @author xujianhu
 * @date 2022-07-28 16:37
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        SmartAppliancesFacade smartAppliancesFacade = new SmartAppliancesFacade();
        smartAppliancesFacade.say("打开电视");

        smartAppliancesFacade.say("关闭电视");

    }
}
