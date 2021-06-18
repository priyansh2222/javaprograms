package com.company;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }
    public void push(int item){
        if(super.isFull()){
            int[] temp = new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        data[++top]=item;
    }

    public static void main(String[] args) {
        DynamicStack stack=new DynamicStack();
        for (int i = 0; i < 100; i++) {
            stack.push(i);
        }
        System.out.println(stack);
    }
}
