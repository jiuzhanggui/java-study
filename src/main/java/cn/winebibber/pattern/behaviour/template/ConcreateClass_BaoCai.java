package cn.winebibber.pattern.behaviour.template;


/**
 * @author xujianhu
 * @date 2022-07-29 16:15
 * @Description:
 */
public class ConcreateClass_BaoCai extends AbstractClass {
    @Override
    public void pourVegetable() {
        System.out.println("手撕包菜");
    }
    @Override
    public void pourSauce() {
        System.out.println("加点啤酒：啤酒抄包菜");
    }
}
