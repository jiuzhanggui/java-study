package cn.winebibber.pattern.construction.bridge;

/**
 * @author xujianhu
 * @date 2022-07-28 11:53
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        OperatingSystem mac = new Mac(new RMVBFile());
        mac.play("今日说法");
    }
}
