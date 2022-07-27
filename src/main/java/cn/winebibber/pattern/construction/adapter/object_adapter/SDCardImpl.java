package cn.winebibber.pattern.construction.adapter.object_adapter;

/**
 * @author xujianhu
 * @date 2022-07-27 20:25
 * @Description:
 */
public class SDCardImpl implements SDCard {
    public String readSD() {
        System.out.println("读取SD卡内容");
        String msg = "读取SD卡内容";
        return msg;
    }

    public void writeSD(String msg) {
        System.out.println("写入SD卡内容");
    }
}
