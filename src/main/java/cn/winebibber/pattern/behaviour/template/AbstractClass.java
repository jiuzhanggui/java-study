package cn.winebibber.pattern.behaviour.template;

/**
 * @author xujianhu
 * @date 2022-07-29 16:07
 * @Description: 抽象类
 */
public abstract class AbstractClass {
    public void cookProcess() {
        upPot();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    // 起锅
    public void upPot() {
        System.out.println("起锅");
    }

    // 烧油
    public void heatOil() {
        System.out.println("烧油");
    }

    // 加菜
    public abstract void pourVegetable();

    // 加料
    public abstract void pourSauce();

    // 上菜
    public void fry() {
        System.out.println("上菜");
    }
}
