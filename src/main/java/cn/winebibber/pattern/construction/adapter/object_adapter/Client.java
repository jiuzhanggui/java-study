package cn.winebibber.pattern.construction.adapter.object_adapter;

/**
 * @author xujianhu
 * @date 2022-07-27 20:32
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        SDCardImpl sdCard = new SDCardImpl();
        Computer computer = new Computer();
        String s = computer.readSD(sdCard);

        System.out.println("------------------");

        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        String s1 = sdAdapterTF.readSD();
        System.out.println(s1);


    }
}
