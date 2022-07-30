package cn.winebibber.pattern.behaviour.responsibility;

/**
 * @author xujianhu
 * @date 2022-07-30 10:17
 * @Description:
 */
public class LeaveRequest {
    private String name;
    private Integer num;
    private String content;

    public LeaveRequest(String name, Integer num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public Integer getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}
