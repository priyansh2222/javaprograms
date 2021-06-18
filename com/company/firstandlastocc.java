package com.company;

public class firstandlastocc {
    static int firstocc(int[] arr,int i,int key){
        if(i==arr.length)
            return -1;
        if(arr[i]==key)
            return i;
      return   firstocc(arr,i+1,key);
    }
    static int lastocc(int[] arr,int i,int key){
        if(i==arr.length)
            return -1;
        int found=lastocc(arr,i+1,key);

        if(found!=-1)
            return found;
        if(arr[i]==key)
            return i;

        return -1;
    }

    public static void main(String[] args) {
        int[] arr={4,45,5,6,8,8,9};
        System.out.println(firstocc(arr,0,5));
        System.out.println(lastocc(arr,0,5));
    }
}
