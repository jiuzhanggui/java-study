package cn.winebibber.pattern.behaviour.memorandum.white_box;

/**
 * @author 江北的鱼
 * @date 2022/07/31
 * @description: 备忘录管理对象
 */
public class RoleStateCaretaker {
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
