package stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-19
 * Time: 21:03
 */
public class Calculator {
    public static void main(String[] args) {
        String expression = "300+22354*624-2";
        ArrayStackCalculator numStack = new ArrayStackCalculator(10);
        ArrayStackCalculator operStack = new ArrayStackCalculator(10);
        int index = 0;
        int num1 = 0;
        int num2 = 0;
        int oper = 0;
        int ret = 0;
        char ch = ' ';
        String keepNum = "";
        while (true) {
            //依次得到一个字符串
            ch = expression.substring(index, index + 1).charAt(0);
            if (operStack.isOPer(ch)) {
                if (!operStack.isEmpty()) {
                    if (operStack.priority(ch) <= operStack.priority(operStack.peek())) {
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        oper = operStack.pop();
                        ret = numStack.cal(num1, num2, oper);
                        numStack.push(ret);
                        operStack.push(ch);
                    } else {
                        //当前的优先级大于栈中的操作符，就直接导入符号栈
                        operStack.push(ch);
                    }
                } else {
                    //如果为空直接加入符号栈
                    operStack.push(ch);
                }
            } else {
                //如果是数字，则直接入数栈
                // numStack.push(ch-48)
                //当遇到多位数时,先看一位数，在往后看是否是数字如果是数字继续往后看，如果不是则入栈
                keepNum += ch;
                if (index == expression.length() - 1) {
                    numStack.push(Integer.parseInt(keepNum));
                } else {
                    if (operStack.isOPer(expression.substring(index + 1, index + 2).charAt(0))) {
                        numStack.push(Integer.parseInt(keepNum));
                        keepNum = "";
                    }
                }
            }
            index++;
            if (index >= expression.length()) {
                break;
            }
        }
        while (true) {
            if (operStack.isEmpty()) {
                break;
            }
            num1 = numStack.pop();
            num2 = numStack.pop();
            oper = operStack.pop();
            ret = numStack.cal(num1, num2, oper);
            numStack.push(ret);
        }
        System.out.printf("表达式%s = %d", expression, numStack.pop());
    }
}
