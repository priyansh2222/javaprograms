package com.company;

public class dynamicCircularQueue extends CircularQueue{
    void  add(int item){
        int[] temp=new int[data.length*2];
        if(isFull()) {

            for (int i = 0; i < size; i++) {
                temp[i] = data[(front + i) % data.length];

            }
            data = temp;
        }

         super.add(item);
        }
    }

