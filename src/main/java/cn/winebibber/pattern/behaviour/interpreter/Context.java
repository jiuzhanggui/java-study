package cn.winebibber.pattern.behaviour.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 江北的鱼
 * @date 2022/07/31
 * @description: 环境角色类
 */
public class Context {
    private Map map = new HashMap<Variable, Integer>();

    public void assign(Variable var, Integer value) {
        map.put(var, value);
    }

    public int getValue(Variable var) {
        Integer value = (Integer) map.get(var);
        return value;
    }
}
