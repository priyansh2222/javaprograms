package com.company;

public class selectionsort {
    static int[] selectionSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

        return arr;
    }


    public static void main(String[] args) {

        int[] arr= {5,4,7,5,6,3};
        int[] arr1=selectionSort(arr);
        for (int element: arr1)
            System.out.println(element);
    }

}

