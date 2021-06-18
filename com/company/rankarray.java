package com.company;

import java.util.Arrays;

public class rankarray {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,3,3,4,4,6,5};
        int a=rankarray(arr);
        System.out.println(a);
        System.out.println(Arrays.toString(arr));
    }

    private static int rankarray(int[] arr) {

        int[] tmp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(tmp);
        int rank=1;
        for (int i = arr.length-1; i >=0; i--) {
            int max=tmp[i];
            arr[i]=rank;
            for(int j=i-1;j>=0;j--){
                if(max==tmp[j]){
                    tmp[j]=rank;
                    i--;
                }
            }
            rank++;
        }
return 5;
    }
}

