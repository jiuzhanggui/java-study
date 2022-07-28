package cn.winebibber.pattern.construction.bridge;

/**
 * @author xujianhu
 * @date 2022-07-28 11:49
 * @Description: 操作系统抽象类（抽象画角色类）
 */
public abstract class OperatingSystem {
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile){
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
