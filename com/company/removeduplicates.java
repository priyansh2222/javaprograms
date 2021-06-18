package com.company;

import java.util.Arrays;

public class removeduplicates {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,3,3,4,4,6,5};
        int a=removedupli(arr);
        System.out.println(a);
        System.out.println(Arrays.toString(arr));
    }

    private static int removedupli(int[] arr) {
        int k=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]!=-5555){
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i] == arr[j])
                        arr[j] = -5555;

                }
                    arr[k] = arr[i];
                    k++;

            }
        }
    return k;
    }
}
