package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class countingsort {
    static int[] B;
    static void countingsort(int[] A,int max,int n)
    {
        B = new int[100];
        int[] C=new int[100];
    for(int i=1;i<=n;i++)
        C[A[i]]=C[A[i]]+1;
    for(int i=1;i<=max;i++)
        C[i]=C[i]+C[i-1];
    for(int i=n;i>=1;i--)
    {
        B[C[A[i]]]=A[i];
        C[A[i]]-=1;
    }

    }

    public static void main(String[] args) {
        int[] arr=new int[100];
        int n=5;
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=n;i++)
            arr[i]=sc.nextInt();
        int max =0;
        for(int element:arr){
            max=Integer.max(max,element);
        }
         countingsort(arr,max,n);
       for(int i=1;i<=n;i++){
           System.out.print(B[i]+" ");
       }
    }
}
