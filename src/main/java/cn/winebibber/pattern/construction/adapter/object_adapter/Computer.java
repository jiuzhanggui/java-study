package cn.winebibber.pattern.construction.adapter.object_adapter;

/**
 * @author xujianhu
 * @date 2022-07-27 20:30
 * @Description:
 */
public class Computer {
    public String readSD(SDCard sdCard){
        return sdCard.readSD();
    }
}
