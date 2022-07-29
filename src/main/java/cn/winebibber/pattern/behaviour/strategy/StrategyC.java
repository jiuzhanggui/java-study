package cn.winebibber.pattern.behaviour.strategy;

/**
 * @author xujianhu
 * @date 2022-07-29 17:00
 * @Description: 具体策略类
 */
public class StrategyC implements Strategy{
    public void show() {
        System.out.println("调用C逻辑");
    }
}
