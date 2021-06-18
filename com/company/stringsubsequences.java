package com.company;

public class stringsubsequences{
//    static void subseq(StringBuilder str,int start){
//        if(start==str.length())
//            return;
//        System.out.println(str.substring(start,str.length()));
//        subseq(str,start+1);
//    }
    public  static void main(String args[]) {
        StringBuilder s = new StringBuilder("abc");

   for (int i=0;i<s.length();i++)
        for(int j=i+1;j<=s.length();j++)
        System.out.println(s.substring(i,j));
    }

}
