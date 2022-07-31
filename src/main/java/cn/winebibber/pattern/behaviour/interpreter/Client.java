package cn.winebibber.pattern.behaviour.interpreter;

/**
 * @author 江北的鱼
 * @date 2022/07/31
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");

        context.assign(a,1);
        context.assign(b,2);
        context.assign(c,3);
        context.assign(d,4);

        //  a+b-c+d
        AbstractExpression expression = new Minus(a, new Plus(new Minus(b, c), d));
        int interpret = expression.interpret(context);
        System.out.println(expression + " = " + interpret);
    }
}
