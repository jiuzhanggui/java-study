package cn.winebibber.pattern.construction.composite;

/**
 * @author xujianhu
 * @date 2022-07-28 17:39
 * @Description: 叶子节点
 */
public class MenuItem extends MenuComponent{
    public MenuItem(String name, Integer level){
        this.name = name;
        this.level = level;
    }
    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }
}
