package com.company;

public class permutations {
    static void Permuations(String str,String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
         char ch=str.charAt(i);
         String ros=str.substring(0,i)+str.substring(i+1);
         Permuations(ros,ans+ch);

        }
    }

    public static void main(String[] args) {
        Permuations("ABCD","");
    }
}
