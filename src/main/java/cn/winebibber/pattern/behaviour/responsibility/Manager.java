package cn.winebibber.pattern.behaviour.responsibility;

/**
 * @author xujianhu
 * @date 2022-07-30 10:20
 * @Description:
 */
public class Manager extends Handler {
    public Manager() {
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    public void handleLeave(LeaveRequest request) {
        System.out.println(request.getName() + "因" + request.getContent() + "请假" + request.getNum() + "天");
        System.out.println("经理同意");
    }
}
