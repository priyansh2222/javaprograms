package com.company;


public class arraysoted {
    static boolean sorted(int[] arr,int start){
            if(start==arr.length-1)
                return true;
            return arr[start]>arr[start+1]&&sorted(arr,start+1);
    }
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3};
        System.out.println(sorted(arr,0));
    }
}
