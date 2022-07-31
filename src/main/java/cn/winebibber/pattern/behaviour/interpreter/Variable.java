package cn.winebibber.pattern.behaviour.interpreter;

/**
 * @author 江北的鱼
 * @date 2022/07/31
 * @description: 封装变量类
 */
public class Variable extends AbstractExpression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public int interpret(Context context) {
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return "Variable{" +
                "name='" + name + '\'' +
                '}';
    }
}
