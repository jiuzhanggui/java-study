package cn.winebibber.pattern.construction.flyweight;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author xujianhu
 * @date 2022-07-28 18:44
 * @Description: 享元工厂类
 */
public class BoxFactory {
    private Map<String, AbstractBox> map;

    private BoxFactory() {
        map = new HashMap<String, AbstractBox>();
        map.put("I", new IBox());
        map.put("L", new LBox());
        map.put("O", new OBox());
    }

    public static BoxFactory boxFactory = new BoxFactory();

    public static BoxFactory getInstance() {
        return boxFactory;
    }

    public AbstractBox getBox(String name) {
        return map.get(name);
    }
}
