package cn.winebibber.pattern.behaviour.memorandum.black_box;


/**
 * @author 江北的鱼
 * @date 2022/07/31
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("----- 打boss之前 -----");
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();

        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setMemento(gameRole.saveState());

        System.out.println("----- 打boss之后 -----");
        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println("----- 加载存档 -----");
        gameRole.recoverState(roleStateCaretaker.getMemento());
        gameRole.stateDisplay();


    }
}
