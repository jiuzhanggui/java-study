package cn.winebibber.pattern.construction.adapter.class_adapter;

/**
 * @author xujianhu
 * @date 2022-07-27 20:23
 * @Description: 目标接口
 */
public interface TFCard {
    public String readTF();

    public void writeTF(String msg);
}
