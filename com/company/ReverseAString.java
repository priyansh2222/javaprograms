package com.company;

public class ReverseAString {
    static void reverse(String str){
        if(str.isEmpty())
            return ;
        char ch=str.charAt(0);
         str = str.substring(1,str.length());
        reverse(str);
        System.out.println(ch);
    }
    public static void main(String[] args) {
        String str="priyansh";
        reverse(str);
    }
}
