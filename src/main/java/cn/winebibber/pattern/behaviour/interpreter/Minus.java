package cn.winebibber.pattern.behaviour.interpreter;

/**
 * @author 江北的鱼
 * @date 2022/07/31
 * @description:
 */
public class Minus extends AbstractExpression{
    private AbstractExpression left;
    private AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    public int interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }
}
