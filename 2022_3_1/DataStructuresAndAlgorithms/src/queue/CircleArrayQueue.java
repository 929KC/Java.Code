package queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-19
 * Time: 12:15
 */
public class CircleArrayQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public CircleArrayQueue(int size) {
        maxSize = size;
        arr = new int[size];
    }

    public boolean isEmpty() {
        return this.rear == this.front;
    }

    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    public void addQueue(int value) {
        if (isFull()) {
            System.out.println("该队列已满，无法添加数据。");
        }
        arr[rear] = value;
        rear = (rear + 1) % maxSize;
    }

    public int getQueue() {
        if (isEmpty()) {
            System.out.println("该队列为空，无法取出数据。");
        }
        int value = arr[front];
        front = (front + 1) % maxSize;
        return value;
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("该队列为空，没有数据展示！");
            return;
        } else {
            for (int i = this.front; i < this.front + this.sizeCount(); ++i) {
                System.out.printf("arr[%d]=%d\n", i % this.maxSize, this.arr[i % this.maxSize]);
            }

        }
    }

    public int headQueue() {
        if (this.isEmpty()) {
            throw new RuntimeException("队列空的，没有数据~~");
        } else {
            return this.arr[this.front];
        }
    }

    public int sizeCount() {
        return (rear = maxSize - front) % maxSize;
    }
}
