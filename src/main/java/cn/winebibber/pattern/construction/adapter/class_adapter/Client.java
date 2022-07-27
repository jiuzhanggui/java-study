package cn.winebibber.pattern.construction.adapter.class_adapter;

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


        String s2 = computer.readSD( new SDAdapterTF());
        System.out.println(s2);


    }
}
