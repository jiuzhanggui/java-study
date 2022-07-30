package cn.winebibber.pattern.behaviour.responsibility;

/**
 * @author xujianhu
 * @date 2022-07-30 10:12
 * @Description: 抽象处理者
 */
public abstract class Handler {
    protected static final Integer NUM_ONE = 1;
    protected static final Integer NUM_THREE = 3;
    protected static final Integer NUM_SEVEN = 7;

    private Integer numStart;
    private Integer numEnd;
    private Handler nextHandler;

    public Handler(Integer numStart) {
        this.numStart = numStart;
    }

    public Handler(Integer numStart, Integer numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public final void submit(LeaveRequest leaveRequest) {
        this.handleLeave(leaveRequest);
        if (this.nextHandler != null && leaveRequest.getNum() > this.numEnd) {
            this.nextHandler.submit(leaveRequest);
        } else {
            System.out.println("任务结束");
        }
    }

    public abstract void handleLeave(LeaveRequest request);
}
