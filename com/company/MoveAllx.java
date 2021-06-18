package com.company;

public class MoveAllx {
    static String moveAllx(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch=str.charAt(0);
        String ans=moveAllx(str.substring(1));
        if(ch=='x')
            return ans+ch;
        return ch+ans;
    }

    public static void main(String[] args) {
        String str="pxiexpjxjx[ejx";
        System.out.println(moveAllx(str));
    }
}
