package cn.winebibber.pattern.construction.flyweight;

/**
 * @author xujianhu
 * @date 2022-07-28 18:40
 * @Description: 抽象享元类
 */
public abstract class AbstractBox {
    public abstract String getShape();
    public void disPlay(String color){
        System.out.println("颜色为" + color + "的" + getShape() + "形");
    }
}
