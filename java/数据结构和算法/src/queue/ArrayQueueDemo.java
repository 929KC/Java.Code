package queue;

import java.util.Scanner;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-18
 * Time: 16:19
 */
public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue q=new ArrayQueue(3);
        char key=' ';
        Scanner sc=new Scanner(System.in);
        boolean loop=true;
        while (loop) {
            System.out.println("show,显示队列数据");
            System.out.println("exit，退出系统");
            System.out.println("add，添加数据");
            System.out.println("get,获取数据");
            System.out.println("head,得到头数据");
            key=sc.next().charAt(0);
            switch (key){
                case 's':
                   q.showQueue();
                   break;
                case 'a':
                    System.out.println("输出一个数");
                    int value=sc.nextInt();
                    q.addQueue(value);
                    break;
                case 'g':
                    try {
                       int res=q.getQueue();
                        System.out.printf("取出的数据是%d\n",res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                  try {
                      int res=q.headQueue();
                      System.out.printf("队列的头数据是%d\n",res);
                  }catch (Exception e){
                      System.out.println(e.getMessage());
                  }
                  break;
                case 'e':
                    sc.close();
                    loop=false;
                    break;
                default:
                    break;

            }

        }
        System.out.println("程序退出");

    }

    public static class  ArrayQueue{
    private  int maxSize;
    private int [] arr ;
    private int rear;
    private int front;

    public  ArrayQueue(int arrMaxSize){
        maxSize=arrMaxSize;
        rear=-1;
        front=-1;
      arr= new int[maxSize];
    }
    //判断队列是否已满
        public  boolean isFull(){
        return  rear==maxSize-1;
        }
        //判断队列是否为空
        public boolean isEmpty(){
        return rear==front;
        }

        //调加数据到队列
        public void addQueue(int n){
        if (isFull()){
            System.out.println("队列已满，不能添加");
            return ;
        }
            rear++;
        arr[rear]=n;

         }
    //获取队列的数据
        public  int  getQueue() {
            if (isEmpty()) {
                throw new RuntimeException("队列为空，不能添加");

            }
            front++;
            return arr[front];
        }

        //显示队列的数据
        public void showQueue(){
    if (isEmpty()){
        System.out.println("队列是空的，没有数据");
        return;
    }
            for (int i = 0; i < arr.length ; i++) {
                System.out.printf("arr[%d]=%d\n",i,arr[i]);
            }
        }

        //显示头部数据
        public  int headQueue(){
        if (isEmpty()){
            throw  new RuntimeException("队列是空的，没有数据");
        }
        return  arr[front+1];
        }

      }
}
