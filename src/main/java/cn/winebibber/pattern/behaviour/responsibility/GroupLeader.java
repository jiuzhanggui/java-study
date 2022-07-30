package cn.winebibber.pattern.behaviour.responsibility;

/**
 * @author xujianhu
 * @date 2022-07-30 10:20
 * @Description:
 */
public class GroupLeader extends Handler {
    public GroupLeader() {
        super(0, Handler.NUM_ONE);
    }

    public void handleLeave(LeaveRequest request) {
        System.out.println(request.getName() + "因" + request.getContent() + "请假" + request.getNum() + "天");
        System.out.println("组长同意");
    }
}
