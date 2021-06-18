package com.company;

public class primenumber {

public static void main(String args[]){
    int n=1000;
    int[] arr=new int[n+1];
    int start=2;
    int end=arr.length;
    for(int i=2;i<arr.length;i++)
        arr[i]=8;
    while(start<end){
        if(arr[start]==8){
        for(int i=start*start;i<arr.length;i=i+start){
            if(i%start==0)
                arr[i]=1;
        }
    }
        start++;
    }
    for (int i=0;i<arr.length;i++){
        if(arr[i]==8)
            System.out.println(i);
    }
}
}
