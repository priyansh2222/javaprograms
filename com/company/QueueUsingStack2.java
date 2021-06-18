package com.company;

public class QueueUsingStack2 {
    DynamicStack stack1;

    QueueUsingStack2() {
        stack1=new DynamicStack();


    }
//    Integer dequeue(){
//        if(stack1.isEmpty() ) {
//            System.out.println("queue is empty ");
//            return null;
//        }
//        if(stack2.isEmpty()){
//            while(!stack1.isEmpty()){
//                stack2.push(stack1.pop());
//            }
//        }
//        int temp= stack2.pop();
//        while(!stack2.isEmpty()){
//            stack1.push(stack2.pop());
//        }
//        return temp;}

    void enqueue(int item){
        stack1.push(item);
    }
    public static void main(String[] args) {
        QueueUsingStack queue =new QueueUsingStack();
        queue.enqueue(55);
        queue.enqueue(66);
        queue.enqueue(63);
        queue.enqueue(77);
        queue.enqueue(55);
        for(int i=0;i<55;i++)
            queue.enqueue(i);
        for (int i = 0; i < 55; i++) {
            System.out.println(queue.dequeue());
        }



    }
}
