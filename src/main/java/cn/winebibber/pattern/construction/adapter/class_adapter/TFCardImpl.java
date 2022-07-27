package cn.winebibber.pattern.construction.adapter.class_adapter;

/**
 * @author xujianhu
 * @date 2022-07-27 20:29
 * @Description:
 */
public class TFCardImpl implements TFCard{
    public String readTF() {
        return "读取TF卡内容";
    }

    public void writeTF(String msg) {
        System.out.println("写入TF卡内容");
    }
}
