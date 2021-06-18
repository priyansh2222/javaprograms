package com.company;

public class mergesort {
    static void merge(int[] arr,int l,int mid, int r){

        int n1=mid-l+1;
        int n2=r-mid;
        int[] a=new int[n1];
        int[] b=new int[n2];
        for(int i=0;i<n1;i++){
            a[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            b[j]=arr[mid+1+j];
        }

        int i=0;
        int j=0;
        int k=l;

        while(i<n1 && j<n2){
            if (a[i]<b[j]){
                arr[k]=a[i];
                i++;
                k++;
            }
            else{
                arr[k]= b[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            arr[k]=a[i];
            i++;k++;

        }
        while(j<n2){
            arr[k]=b[j];
            k++;j++;
        }

    }



    static void mergesort(int[] arr,int l,int r){

        if(l<r){
            int  mid= (r+l)/2;
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }





    }
    public static void main(String []args){

        int[] arr={4,2,4,7,4,5,7,8,53,6,5,4,25,8,6,3,1,45,8,2,5,4};
        mergesort(arr,0,arr.length-1);
        for (int element:arr)
            System.out.print(" "+element);

    }
}