package com.company;

public class subs {
    static void subs(String str,String ans){
        if(str.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        str = str.substring(1);
        subs(str,ans);
        subs(str,ans+ch);
    }

    public static void main(String[] args) {
        subs("ABC","");
    }
}
