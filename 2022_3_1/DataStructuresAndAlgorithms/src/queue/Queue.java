package queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-17
 * Time: 21:51
 */
public class Queue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public Queue(int size) {
        maxSize = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public void addQueue(int value) {
        if (isFull()) {
            System.out.println("该队列已满，无法添加数据。");
        }
            rear++;
            arr[rear] = value;
    }

    public int getQueue(){
        if(isEmpty()){
            System.out.println("该队列为空，无法取出数据。");
        }
        front++;
        return  arr[front];
    }

    public void show(){
       if(isEmpty()){
           System.out.println("该队列为空，没有数据展示！");
           return;
       }

        for(int i=0;i<arr.length;i++){
            System.out.printf("arr[%d]==%d ",i,arr[i]);
            System.out.println();
        }
    }

    public int headQueue() {
        if(isEmpty()){
            System.out.println("该队列为空，没有数据展示！");
        }
        return arr[front++];
    }
}
