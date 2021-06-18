package com.company;

import java.util.Arrays;

public class CustomStack {
    protected int[] data;
    protected int top=-1;

    public CustomStack(){
    data = new int[10];
    }
    public CustomStack(int size){
        data = new int[size];
    }
    public void push(int item){

        if(isFull()){
            System.out.println("stack overflow ...");
            return ;
        }
        this.data[++top]=item;
    }
    public boolean isFull(){
        return this.top==this.data.length-1;
    }
    public boolean isEmpty(){
        return this.top==-1;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is underflow ");
        return -1;
        }
        return this.data[this.top--];
    }
    public int peek(){
        return this.data[top];
    }
    public String toString(){

        return Arrays.toString(this.data);
    }
    public static void main(String[] args) {
        CustomStack stack=new CustomStack();
//        stack.push(10);
//        stack.push(33);
//        stack.push(55);
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
    }
}
