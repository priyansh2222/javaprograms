public class searchinrecurssion {
    static boolean search(int[] arr,int element,int index){
        if(index==arr.length-1)
            return false;
        if(arr[index]==element)
            return true;
        return search(arr,element,index+1);
    }
    public static void main(String args[]){
        int[] arr={4,5,4,5,6,4,6,4};
        System.out.println(search(arr,55,0));
    }
}
