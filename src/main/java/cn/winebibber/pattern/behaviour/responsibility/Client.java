package cn.winebibber.pattern.behaviour.responsibility;

/**
 * @author xujianhu
 * @date 2022-07-30 10:26
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        GeneralManage generalManage = new GeneralManage();
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();

        LeaveRequest leaveRequest = new LeaveRequest("阿飞", 1 , "旅游");

        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManage);

        groupLeader.submit(leaveRequest);
    }
}
