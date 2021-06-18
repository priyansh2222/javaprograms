package com.company;
import java.util.Stack;

public class ReverseOfSencence {
    static  void ReverseOfSencence(String str){
        Stack<String> stack = new Stack();

        for(int i=0;i<str.length();i++){
            String word="";
            while(!(i<str.length() && str.charAt(i)==' '))
            {
             word+=str.charAt(i);
             i++;
            }
            stack.push(word);
        }
        while(!(stack.isEmpty()))
        {
            System.out.print(stack.pop()+" ");
        }
    }
    public static void main(String[] args) {
       String str=" I study in IMS  ";
        ReverseOfSencence(str);
    }
}
