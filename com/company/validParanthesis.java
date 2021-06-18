package com.company;

import java.util.Stack;

public class validParanthesis {

    public static boolean validParanthesis(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[')
                stack.push(str.charAt(i));
            else {
                char ch = openbracket(str.charAt(i));
                if (stack.pop()==ch){

                }
                else {
                    return false;
                }
            }
        }
        if(stack.empty())
        return true;
        else
            return false;
    }

    public static void main(String[] args) {

        String str = "{{}}";
        System.out.println(validParanthesis(str));

    }

     static char openbracket(char ch) {
    if(ch=='}')
        return '{';
    if (ch==')')
        return '(';

        return '[';
    }
}
