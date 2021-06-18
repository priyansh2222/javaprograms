package com.company;

public class sortarray012 {
    static int[] sort(int[] arr){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1)
                mid++;
            else if(arr[mid]==2){
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;

            }
        }
        return arr;
    }
    public static void main(String []args){
        int[] arr={0,1,2,0,1,0,2,0,1,0,2,0,1,0,1};
        sort(arr);
        for(int element : arr)
            System.out.print(element +" ");
    }
}
