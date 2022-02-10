package CollectionList;

import java.util.LinkedList;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-10
 * Time: 19:13
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> stack=new LinkedList();
        //栈
        //压栈
        stack.add("第一颗子弹");
        stack.add("第二颗子弹");
        stack.add("第三颗子弹");
        stack.add("第四颗子弹");
        stack.add("第五颗子弹");
        //出/弹栈
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());

        //队列
        LinkedList<String> queue=new LinkedList<>();
        //入队
        queue.addLast("你是猪");
        queue.addLast("黄茂荣");
        queue.addLast("叶秋涵");
        System.out.println(queue);
        //出队
        System.out.println(queue.removeLast());
        System.out.println(queue.removeLast());
        System.out.println(queue.removeLast());
    }
}
