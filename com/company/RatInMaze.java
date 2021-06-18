package com.company;

import java.util.Arrays;

public class RatInMaze {
    static boolean isSafe(int[][] arr,int x,int y,int n){
        if(x<=n && y<=n && arr[x][y]==1){
            return true;
        }
        return false;
    }
    static boolean ratinlmaze(int[][] arr, int x, int y, int n, int[][] sol){

        if(x==n-1 && y==n-1){
            sol[x][y]=1;
            return true;
        }
        if(isSafe(arr,x,y,n)){
            sol[x][y]=1;
            if (ratinlmaze(arr, x+1, y, n, sol)) {
                return true;
            }
            if(ratinlmaze(arr,x,y+1,n,sol)){
                return true;
            }
            sol[x][y]=0;
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr={{1,0,1,0,1},{1,1,1,1,1},{0,1,0,1,0},{1,0,0,1,1},{1,1,1,0,1}};
        int[][] sol=new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sol[i][j]=0;
            }
        }
        ratinlmaze(arr,0,0,arr.length,sol);
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol[i].length; j++) {
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }
}
