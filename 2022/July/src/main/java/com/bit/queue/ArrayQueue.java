package com.bit.queue;


/**
 * truth:talk is cheap, show me the code
 *
 * @author KC萧寒
 * @description
 * @createDate: 2022-07-09 21:44
 */

public class ArrayQueue {
    public static final int  DEFAULT_CAPACITY=5;
    private int font ;
    private  int rear;
    private int []  el;

    public ArrayQueue(){
        el=new int[DEFAULT_CAPACITY];
        font=-1;
        rear=-1;
    }

    public boolean offer(int val){
        if(isFull()){

        }
        rear++;
        el[rear]=val;
        return true;
    }

    public int peek(){
        return -1;
    }

    public int size(){
        return rear;
    }

   public boolean isEmpty(){
        return font==rear;
    }

    public boolean isFull(){
        return rear==DEFAULT_CAPACITY-1;
    }
}
