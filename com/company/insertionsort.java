package com.company;
public  class insertionsort {

static int[] insertionSort(int[] arr) {
/*
        for(int i=1;i<arr.length;i++){
        int j=i-1;
        int temp=arr[i];
        while(temp<arr[j] && j>=0){
        arr[j+1]=arr[j];
        j--;
        }
        arr[j+1]=temp;

        }
        return arr;
        }
*/

	for(int i=1;i<arr.length;i++) {
			int j=i-1;
			int temp=arr[i];
			while(j>=0 && temp<arr[j]){
			    arr[j+1]=arr[j];
			    j--;
			}
			arr[j+1]=temp;
		}

		return arr;

	}


public static void main(String[] args) {

        int[] arr= {5,4,3,5,6,3};
        int[] arr1=insertionSort(arr);
        for (int element: arr1)
        System.out.print(element);
        }

        }
