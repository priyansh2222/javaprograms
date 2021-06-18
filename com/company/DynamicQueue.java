package com.company;

public class DynamicQueue extends CustomQueue{
    DynamicQueue(){
        super();
    }
    DynamicQueue(int size){
        super(size);
    }
    void add(int item){
        if(isFull()){
            int[] temp=new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }

        this.data[++this.end]=item;
        return;
    }
}
