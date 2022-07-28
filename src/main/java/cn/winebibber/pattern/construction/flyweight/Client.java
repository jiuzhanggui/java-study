package cn.winebibber.pattern.construction.flyweight;

/**
 * @author xujianhu
 * @date 2022-07-28 18:47
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        AbstractBox box = BoxFactory.getInstance().getBox("L");
        box.disPlay("红色");
        box.getShape();

        AbstractBox box1 = BoxFactory.getInstance().getBox("O");
        box1.disPlay("白色");
        box1.getShape();

        AbstractBox box2 = BoxFactory.getInstance().getBox("L");
        box2.disPlay("蓝色");
        box2.getShape();
    }
}
