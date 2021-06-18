package com.company;

import java.util.Arrays;

public class myprob {

static void  printmat(int[][] arr){
    for (int i = 0; i <arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}
static boolean isEqual(int[][] arr1,int[][] arr2) {
    for (int i = 0; i < arr1.length; i++) {
        for (int j = 0; j < arr1.length; j++) {
            if (arr1[i][j] != arr2[i][j]) {
                return false;
            }
        }
    }
        return true;
    }
    public static boolean findRotation ( int[][] arr, int[][] target){


    int a=4;
            while(a-->0) {

                for (int i = arr.length - 1, p = 0; i >= 0; i--, p++) {
                    for (int j = 0, q = 0; j < arr.length; j++, q++) {
                        int temp = arr[q][p];
                        arr[q][p] = arr[i][j];
                        arr[i][j] = temp;
                    }
                }

                System.out.println("after 90' turn ");
                printmat(arr);
                if(isEqual(arr,target))
                    return true;
            }
        return false;


    }


    public static void main(String[] args) {
        int[][] arr={{0,0,0},{0,1,0},{1,1,1}};
        System.out.println("first array ");
        printmat(arr);
        int[][] target={{1,1,1},{0,1,0},{0,0,0}};
        System.out.println("target array ");
        printmat(target);
        System.out.println(myprob.findRotation(arr,target));
    }
}