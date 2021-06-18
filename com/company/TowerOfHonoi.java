package com.company;

public class TowerOfHonoi {
    static void ToH(int n,char source,char destination,char helper){
        if(n==0){
            return;
        }
        ToH(n-1,source,helper,destination);
        System.out.println("Move from "+source+" To "+destination);
        ToH(n-1,helper,destination,source);
    }

    public static void main(String[] args) {
        ToH(3,'A','C','B');
    }
}
