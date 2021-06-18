package com.company;

public class bubblesort {

    static int[] bubbleSort(int[] arr) {
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr.length-i-1;j++){
               if(arr[j]>arr[j+1])
               {
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
       }
        return arr;
    }


    public static void main(String[] args) {

        int[] arr= {5,4,7,5,6,55};
        int[] arr1=bubbleSort(arr);
        for (int element: arr1)
            System.out.println(element);
    }

}