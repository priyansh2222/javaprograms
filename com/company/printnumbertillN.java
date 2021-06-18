package com.company;

public class printnumbertillN {
    static void printrev(int n){

        System.out.println(n);

        if(n==1)
            return;
        printrev(n-1);
    }
    static void printass(int n){



        if(n==0)
            return;
        printass(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n=55;
        printrev(55);
        printass(n);
    }
}
