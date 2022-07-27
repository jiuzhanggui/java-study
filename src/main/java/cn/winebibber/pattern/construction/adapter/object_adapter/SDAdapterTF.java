package cn.winebibber.pattern.construction.adapter.object_adapter;

/**
 * @author xujianhu
 * @date 2022-07-27 20:31
 * @Description: 类适配器
 */
public class SDAdapterTF implements SDCard {

    private TFCard tfCard ;

    public SDAdapterTF(TFCard tfCard){
        this.tfCard = tfCard;
    }

    public String readSD() {
        return tfCard.readTF();
    }

    public void writeSD(String msg) {
        tfCard.writeTF(msg);
    }
}
