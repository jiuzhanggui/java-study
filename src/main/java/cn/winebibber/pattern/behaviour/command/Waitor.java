package cn.winebibber.pattern.behaviour.command;

import java.util.ArrayList;

/**
 * @author xujianhu
 * @date 2022-07-29 17:55
 * @Description: 服务员类（属于请求者角色）
 */
public class Waitor {
    // 持有多个命令对象
    private ArrayList<Command> commands;

    public void setCommands(Command commands) {
        this.commands.add(commands);
    }

    // 发起命令功能
    public void orderUp(){
        System.out.println("新订单来了");
        for (Command command : commands) {
            if (command != null){
                command.execute();
            }
        }
    }
}
