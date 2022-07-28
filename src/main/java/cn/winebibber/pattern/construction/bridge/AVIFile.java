package cn.winebibber.pattern.construction.bridge;

/**
 * @author xujianhu
 * @date 2022-07-28 11:48
 * @Description: AVI格式视频文件类（具体实现化角色）
 */
public class AVIFile implements VideoFile{
    public void decode(String fileName) {
        System.out.println("使用AVI格式播放电影：" + fileName);
    }
}
