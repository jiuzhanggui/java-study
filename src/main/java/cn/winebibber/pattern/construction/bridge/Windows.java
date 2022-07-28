package cn.winebibber.pattern.construction.bridge;

/**
 * @author xujianhu
 * @date 2022-07-28 11:51
 * @Description: windows系统类（扩展抽象化角色）
 */
public class Windows extends OperatingSystem{
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
