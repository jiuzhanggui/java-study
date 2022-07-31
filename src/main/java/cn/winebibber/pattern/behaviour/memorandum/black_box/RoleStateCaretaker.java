package cn.winebibber.pattern.behaviour.memorandum.black_box;

/**
 * @author 江北的鱼
 * @date 2022/07/31
 * @description:
 */
public class RoleStateCaretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
