package cn.winebibber.pattern.behaviour.template;

/**
 * @author xujianhu
 * @date 2022-07-29 16:15
 * @Description:
 */
public class ConcreateClass_TuDou extends AbstractClass {
    @Override
    public void pourVegetable() {
        System.out.println("酸辣土豆丝");
    }
    @Override
    public void pourSauce() {
        System.out.println("加点酸菜");
    }
}
