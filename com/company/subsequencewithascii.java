package com.company;

public class subsequencewithascii {
    static void Subseqencewithascii(String str,String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        int code=ch;
        String ros = str.substring(1);
        Subseqencewithascii(ros,ans);
        Subseqencewithascii(ros,ans+ch);
        Subseqencewithascii(ros,ans+code);
    }

    public static void main(String[] args) {
        Subseqencewithascii("AB","");
    }
}
