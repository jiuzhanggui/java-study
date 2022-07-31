package cn.winebibber.pattern.behaviour.interpreter;

/**
 * @author 江北的鱼
 * @date 2022/07/31
 * @description: 抽象表达式类
 */
public abstract class AbstractExpression {
    public abstract int interpret(Context context);
}
