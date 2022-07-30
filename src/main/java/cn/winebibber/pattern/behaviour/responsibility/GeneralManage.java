package cn.winebibber.pattern.behaviour.responsibility;

/**
 * @author xujianhu
 * @date 2022-07-30 10:20
 * @Description:
 */
public class GeneralManage extends Handler {
    public GeneralManage() {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    public void handleLeave(LeaveRequest request) {
        System.out.println(request.getName() + "因" + request.getContent() + "请假" + request.getNum() + "天");
        System.out.println("总经理同意");
    }
}
