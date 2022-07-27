package cn.winebibber.pattern.construction.adapter.class_adapter;

/**
 * @author xujianhu
 * @date 2022-07-27 20:31
 * @Description: 类适配器
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{

    public String readSD() {
        return readTF();
    }

    public void writeSD(String msg) {
        writeTF(msg);
    }
}
