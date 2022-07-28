package cn.winebibber.pattern.construction.flyweight;

/**
 * @author xujianhu
 * @date 2022-07-28 18:42
 * @Description: 具体享元类
 */
public class IBox extends AbstractBox{
    @Override
    public String getShape() {
        return "I";
    }
}
