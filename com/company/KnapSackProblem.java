package com.company;

public class KnapSackProblem {
    static int knapscack(int[] val,int[] weight,int w,int n){
        if(n==0 || w==0){
            return  0;
        }
        if(weight[n-1]>w){
            return knapscack(val,weight,w,n-1);
        }
        return Math.max(knapscack(val,weight,w-weight[n-1],n-1)+val[n-1],knapscack(val,weight,w,n-1));
    }

    public static void main(String[] args) {
        int[] weight={10,20,30};
        int[] val = {100,50,150};
        int w=50;
        System.out.println(knapscack(val,weight,50,val.length));
    }
}
