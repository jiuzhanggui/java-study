package cn.winebibber.pattern.construction.decoration;

/**
 * @author xujianhu
 * @date 2022-07-28 10:51
 * @Description: 增加烧头（抽象装饰角色）
 */
public abstract class Garnish extends FastFood{
    private FastFood fastFood;

    public Garnish(FastFood fastFood, Double price, String desc){
        super(price, desc);
        this.fastFood = fastFood;
    };

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
