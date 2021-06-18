package com.company;



public class ClientQueue<i> {
    public static void main(String[] args) {


        dynamicCircularQueue queue = new dynamicCircularQueue();
        queue.add(10);
        System.out.println(queue.remove());
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        queue.add(52);
        queue.add(99);
        queue.add(45);
        queue.add(89);
        System.out.println(queue.remove());
        queue.show();
        for (int i = 0; i < 100; i++) {
            queue.add(i);
        }
queue.show();

//        for(int i=0;i<120;i++)
//            queue.add(i);
//        queue.show();
//
//
//     for(int i=0;i<10;i++){
//         System.out.println(queue.remove());
//    }
//        queue.show();
}}