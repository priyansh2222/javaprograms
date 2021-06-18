package com.company;

public class CustomQueue {
    private  int size;
    int[] data;
      int end;

    CustomQueue(){
        data = new int[10];
        size = 0;
        end=-1;

    }
    CustomQueue(int size){
        data = new int[size];
        this.size=0;
        end=-1;

    }

      void  add(int item){
        if(isFull()){
            System.out.println("Queue is full ");
            return;
        }
        this.data[++this.end]=item;
        return;
    }

     boolean isFull() {
        return this.end==this.data.length-1;
    }
    boolean isEmpty() {
        return this.end==-1;
    }
    Integer  remove(){
        if(isEmpty())
        {
            System.out.println("queue is empty ");
            return null;
        }
        int temp=this.data[0];
        for(int i=0;i<data.length-1;i++){
            this.data[i]=this.data[i+1];
        }
        end--;
        return  temp;
    }
    void show(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        System.out.print("[ "+this.data[0]+" , ");
        for(int i=1;i<=end-1;i++){
            System.out.print(this.data[i]+", ");
        }
        System.out.println(this.data[end]+ " ]");
    }
    public static void main(String[] args) {
        CustomQueue q=new CustomQueue(5);
        q.add(4);
        q.add(5);
        q.add(5);
        q.add(3);
        q.add(5);
        System.out.println(q.remove());
        System.out.println(q.isFull());

    }
}
