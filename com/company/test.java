package com.company;

public class test {
    public static void main(String[] args) {
       String a="abcd";
       test.subseq("",a);
    }

public static void subseq(String proc,String unproc){
  if(unproc.isEmpty()){
      System.out.println(proc);
      return;
  }
  char ch=unproc.charAt(0);
  unproc=unproc.substring(1);

  subseq(proc+ch,unproc);
    subseq( proc,unproc);
}}