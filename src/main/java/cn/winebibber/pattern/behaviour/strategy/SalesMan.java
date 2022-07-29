package cn.winebibber.pattern.behaviour.strategy;

import lombok.Data;

/**
 * @author xujianhu
 * @date 2022-07-29 17:02
 * @Description: 促销员（策略类）
 */
public class SalesMan {
    private Strategy strategy;

    public SalesMan(Strategy strategy){
        this.strategy = strategy;
    }

    public void salesManShow(){
        strategy.show();
    }
}
