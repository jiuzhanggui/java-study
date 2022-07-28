package cn.winebibber.pattern.construction.composite;

/**
 * @author xujianhu
 * @date 2022-07-28 17:50
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        MenuComponent menu1 = new Menu("菜单管理", 2);
        menu1.add(new MenuItem("页面访问", 3));
        menu1.add(new MenuItem("编辑菜单", 3));
        menu1.add(new MenuItem("删除菜单", 3));

        Menu menu2 = new Menu("权限管理",2);
        menu2.add(new MenuItem("增加权限",3));
        menu2.add(new MenuItem("删除权限",3));

        Menu menu = new Menu("系统管理", 1);
        menu.add(menu1);
        menu.add(menu2);

        menu.print();
    }
}
