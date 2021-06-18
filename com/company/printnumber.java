package com.company;

public class printnumber {
      static void  printnumrev(int n){
        if(n==0)
            return;
        System.out.println(n);
        printnum(n-1);
    }
    static void printnum(int n){
          if(n==0)
              return;
          printnum(n-1);
          System.out.println(n);
    }
    public static void main(String args[]){
          printnum(4);
    }
}
