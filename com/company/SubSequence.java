package com.company;

public class SubSequence {
    static void subsequence(String str,String ans){
        if(str.isEmpty()) {
            System.out.println(ans);
            return;
        }
            char ch=str.charAt(0);
            String ros=str.substring(1);
            subsequence(ros,ans);
            subsequence(ros,ans+ch);

        }



    public static void main(String[] args) {
        subsequence("ABCDE","");
    }
}
