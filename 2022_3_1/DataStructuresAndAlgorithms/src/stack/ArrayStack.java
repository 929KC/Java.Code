package stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-19
 * Time: 19:30
 */
public class ArrayStack {
    private int top=-1;
    private int stack [];
    private int maxSize;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        stack=new int[maxSize];
    }

    public boolean isFull(){
        return top==maxSize-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }
    //入栈
    public void push(int value){
        if(isFull()){
            System.out.println("栈满");
            return ;
        }
        top++;
        stack[top]=value;
    }
//出栈
    public int  pop(){
        if(isEmpty()){
            throw new RuntimeException("栈空");
        }
      int value=stack[top];
        top--;
        return value;
    }

    //显示栈的数据
    public void showList(){
       for (int i=stack.length-1;i>=0;i--){
           System.out.printf("下标%d 元素%d\n",i,stack[i]);
       }
    }
}
