package cn.winebibber.pattern.construction.adapter.class_adapter;

/**
 * @author xujianhu
 * @date 2022-07-27 20:24
 * @Description: 适配者接口
 */
public interface SDCard {
    public String readSD();
    public void writeSD(String msg);
}
