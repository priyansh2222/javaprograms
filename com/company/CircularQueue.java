package com.company;

import java.util.Arrays;

public class CircularQueue {
    protected int size;
    int data[];
    int front;
    int end;
    CircularQueue(){
        data=new int[10];
        front=0;
        end=-1;
        size=0;
    }
    CircularQueue(int size){
        data=new int[size];
        front=0;
        end=-1;
        size=0;
    }
    void add(int item){
        if(isFull()){
            System.out.println("queue is full ");
            return;
        }
        data[(++end)%data.length]=item;
        size++;

    }
 Integer remove(){
        if(isEmpty()){
         System.out.println("queue is empty ");
     return null;
        }
    int temp = data[front];
        this.front=(++front)%data.length;
     size--;
        return  temp;
 }
 boolean isEmpty(){
        return size==0;
 }
 boolean isFull(){
        return  size==data.length;
 }


    void show(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
//        System.out.print("[ "+this.data[front]+" , ");
//        for(int i=front+1;i<=end-1;i++){
//            System.out.print(this.data[i]+", ");
//        }
//        System.out.println(this.data[end]+ " ]");
        System.out.println(Arrays.toString(this.data));
    }

    public static void main(String[] args) {
        CircularQueue queue=new CircularQueue(4);
        for (int i = 0; i < 4; i++) {
            queue.add(i);

        }
        System.out.println(queue.isFull());
        queue.remove();
        queue.add(45);
        queue.show();
        queue.remove();
        queue.add(65);
        queue.show();
        queue.add(75);
        queue.show();
        queue.add(85);
        queue.show();
        queue.add(95);
        queue.show();
        queue.add(99);
        queue.show();
    }

}



