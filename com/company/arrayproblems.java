package com.company;

import java.util.Scanner;

public class arrayproblems {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

		/*
			int[] arr= {1,2,3,4,5};
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i];
			}
	System.out.println(sum);
	}
*/
        //print all element of array
		/*int[] arr= {1,2,3,4,5};
				for(int element: arr) {
			System.out.println(element);
		}
		*/

        //sort array using bubble sort
		/*
		int[] arr= {5,6,2,1,43,3};
		for (int i =0;i<arr.length ;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
			for(int element : arr) {
				System.out.println(element);
		}	*/
        //max element in array
		/*

		int[] arr= {1,2,46,4,5};

		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]>max)
			max=arr[i];
		}
System.out.println(max);
*/
		/*
		int[] arr= {5,6,2,1,43,3};
		int n=arr.length/2;
		int l=arr.length;
		for (int i =0;i<n ;i++) {
			int temp=arr[i];
				arr[i]=arr[l-i-1];
				arr[l-i-1]=temp;
				}

				for(int element : arr) {
				System.out.println(element);
		}
			*/
		/*
		int[][] arr= {{1,2,3},{4,5,6}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}

		//addition of matrix

		int[][] arr1= {{1,2,3,4},{5,6,7,8}};
		int [][] arr2 ={{1,1,1,1},{1,1,1,1}};
		int [][] result = {{0,0,0,0},{0,0,0,0}};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				result[i][j]=arr1[i][j]+arr2[i][j];
			}


		}
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				System.out.println(result[i][j]);
			}
			System.out.println();
		}

		// multiplication of matrix
		//int[][] arr1= {{1,2,3,4},{5,6,7,8}};
		//int [][] arr2 ={{1,1,1,1},{1,1,1,1}};

		int [][] arr1= new  int[3][3];
		int [][] arr2= new  int[3][3];
		System.out.println("enter the first elements array : ");
		for (int i=0;i<arr1.length;i++)
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j]=sc.nextInt();
			}
		System.out.println("enter the second  elements array : ");
		for (int i=0;i<arr1.length;i++)
			for(int j=0;j<arr1[i].length;j++) {
				arr2[i][j]=sc.nextInt();
			}
	int [][] result = new int[3][3];




		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				int sum=0;
				for(int k=0;k<arr1.length;k++) {


				sum+=arr1[i][k]*arr2[k][j];
			}
				result[i][j]=sum;
			}

		}


		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				System.out.println(result[i][j]);
			}
			System.out.println();
		}

		//bubble  sorting of array

				int [] arr= new  int[6];
				System.out.println("enter the  elements of array : ");
				for (int i=0;i<arr.length;i++)
				{
						arr[i]=sc.nextInt();
					}

				for (int i =0 ;i<arr.length;i++)
				{
					for(int j=0;j<arr.length-i-1;j++)
					{
						if (arr[j]>arr[j+1]) {
							int temp=arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=temp;
						}
					}
				}

				for (int element : arr) {
					System.out.print(element + " ");
				}




		// selection sort
		int [] arr= new  int[6];
		System.out.println("enter the  elements of array : ");
		for (int i=0;i<arr.length;i++)
		{
				arr[i]=sc.nextInt();
			}
		for(int i= 0; i < arr.length ;i++) {
			int index=i;

			for(int j=i+1;j<arr.length;j++) {
				if(arr[index]>arr[j]) {
					index=j;
				}
			}
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}



		for (int element : arr) {
			System.out.print(element + " ");
		}

		//reverse the array
		int [] arr= new  int[6];
		System.out.println("enter the  elements of array : ");
		for (int i=0;i<arr.length;i++)
		{
				arr[i]=sc.nextInt();
			}
		int mid=arr.length/2;

		for(int i=0;i<=mid;i++)
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}

		for (int element : arr) {
			System.out.print(element + " ");
		}
		*/
        int [] arr= new  int[6];
        System.out.println("enter the  elements of array : ");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int mid=arr.length/2;


        for(int i=0;i<mid;i++) {
            for(int j=0;j<mid;j++) {
                if(arr[i]<arr[j+1]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=mid;i<arr.length;i++) {
            for(int j=mid;j<arr.length;j++) {
                if(arr[i]>arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }


        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}

