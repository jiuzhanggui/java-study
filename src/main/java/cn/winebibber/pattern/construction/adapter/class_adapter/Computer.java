package cn.winebibber.pattern.construction.adapter.class_adapter;

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
