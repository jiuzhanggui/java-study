package cn.winebibber.pattern.construction.composite;

/**
 * @author xujianhu
 * @date 2022-07-28 17:35
 * @Description: 菜单组件(抽象根节点)
 */
public abstract class MenuComponent {
    protected String name;
    protected Integer level;

    // 添加子菜单
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    // 移除子菜单
    public void remove() {
        throw new UnsupportedOperationException();
    }
    // 获取子菜单
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }
    // 打印菜单列表
    public abstract void print();
}
