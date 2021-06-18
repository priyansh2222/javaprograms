public class fibonacci {
    static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibo(n-2)+fibo(n-1);
    }
    public static void main(String args[]){
        int n=5;
        for(int i=0;i<n;i++){
            System.out.print(fibo(i)+"  ");
        }
    }
}
