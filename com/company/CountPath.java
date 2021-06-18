package com.company;

public class CountPath {
    static int countpath(int s,int e){
        if(s==e){
            return 1;
        }
        if(s>e){
            return 0;
        }
        int count=0;
        for (int i = 1; i <=6 ; i++) {
            count+=countpath(s+i,e);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countpath(0,3));
    }
}
