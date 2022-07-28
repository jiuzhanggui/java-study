package cn.winebibber.pattern.construction.decoration;

/**
 * @author xujianhu
 * @date 2022-07-28 10:43
 * @Description: 快餐店类（抽象构建者）
 */
public abstract class FastFood {
    private Double price;
    private String desc;

    public abstract Double cost();

    public FastFood() {
    }

    public FastFood(Double price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
