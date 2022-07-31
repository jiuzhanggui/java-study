package cn.winebibber.pattern.behaviour.memorandum.black_box;

/**
 * @author 江北的鱼
 * @date 2022/07/31
 * @description: 游戏角色类（发起人角色）
 */
public class GameRole {
    private int vit; // 生命
    private int atk; // 攻击
    private int def; // 防御

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void initState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    // 保存角色状态
    public Memento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    // 恢复角色状态
    public void recoverState(Memento memento) {
        RoleStateMemento roleStateMemento = (RoleStateMemento) memento;
        this.vit = roleStateMemento.getVit();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }

    // 展示状态功能
    public void stateDisplay(){
        System.out.println("当前状态为：[生命力: " +vit +"] [攻击力: " +atk +"] [防御力: " +def +"]");
    }

    private class RoleStateMemento implements Memento{
        private int vit;
        private int atk;
        private int def;

        public RoleStateMemento(int vit, int atk, int def) {
            this.vit = vit;
            this.atk = atk;
            this.def = def;
        }

        public int getVit() {
            return vit;
        }

        public void setVit(int vit) {
            this.vit = vit;
        }

        public int getAtk() {
            return atk;
        }

        public void setAtk(int atk) {
            this.atk = atk;
        }

        public int getDef() {
            return def;
        }

        public void setDef(int def) {
            this.def = def;
        }
    }
}
