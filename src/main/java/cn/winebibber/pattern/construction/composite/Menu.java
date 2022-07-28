package cn.winebibber.pattern.construction.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xujianhu
 * @date 2022-07-28 17:42
 * @Description: 树枝节点
 */
public class Menu extends MenuComponent{
    private List<MenuComponent> menuComponentList = new ArrayList<MenuComponent>();

    public Menu(String name, Integer level) {
        this.name = name;
        this.level = level;
    }


    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove() {
        menuComponentList.remove(menuComponentList);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponentList.get(i);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        // 打印菜单项
        System.out.println(name);
        // 打印子菜单项
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }

}
