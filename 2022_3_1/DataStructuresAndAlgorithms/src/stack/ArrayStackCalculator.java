package stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-19
 * Time: 21:40
 */
public class ArrayStackCalculator {
    private int top = -1;
    private int stack[];
    private int maxSize;

    public ArrayStackCalculator(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    //入栈
    public void push(int value) {
        if (isFull()) {
            System.out.println("栈满");
            return;
        }
        top++;
        stack[top] = value;
    }

    //出栈
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈空");
        }
        int value = stack[top];
        top--;
        return value;
    }

    //显示栈的数据
    public void showList() {
        if(isEmpty()) {
            System.out.println("栈空");
            return;
        }
        for (int i = stack.length - 1; i >= 0; i--) {
            System.out.printf("下标%d 元素%d\n", i, stack[i]);
        }
    }

    //返回云运算符的优先级，数字越大，则优先级越高
    public int priority(int oper) {
        if (oper == '*' || oper == '/') {
            return 1;
        } else if (oper == '+' || oper == '-') {
            return 0;
        } else {
            return -1;
        }
    }

    //判断是否是运算符
    public boolean isOPer(char val) {
        return val == '+' || val == '-' || val == '*' || val == '/';
    }

    //计算方法
    public int cal(int num1, int num2, int oper) {
        int ret = 0;
        switch (oper) {
            case '+':
                ret = num1 + num2;
                break;
            case '-':
                ret = num2 - num1;
                break;
            case '*':
                ret = num2 * num1;
                break;
            case '/':
                ret = num2 / num1;
                break;
            default:
                break;
        }
        return ret;
    }

    //返回栈顶的值
    public int peek(){
        return stack[top];
    }

}
