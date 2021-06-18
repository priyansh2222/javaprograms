package com.company;

public class floodfill {
    static void floodfill(int[][] arr,int s,int e,int c,int value){
        if(s>0 || s==arr.length || e>0 || e==arr.length)
            return ;
        if(c!=arr[s][e])
            return;
            arr[s][e]=value;

        floodfill(arr,s-1,e,c,value);
        floodfill(arr,s+1,e,c,value);
        floodfill(arr,s,e-1,c,value);
        floodfill(arr,s,e+1,c,value);

    }
    public static void main(String args[]){
        int[][] arr={{1 ,2,3} ,
                {4,2,2 },
                { 8,3,2}};
        floodfill(arr,1,1,2,9);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
                System.out.print(arr[i][j]+" ");

        System.out.println();
    }}
}
