package cn.winebibber.pattern.construction.bridge;

/**
 * @author xujianhu
 * @date 2022-07-28 11:49
 * @Description: RMVB格式视频文件类（具体实现化角色）
 */
public class RMVBFile implements VideoFile{
    public void decode(String fileName) {
        System.out.println("使用RMVB格式播放电影：" + fileName);
    }
}
