public class factorial {
    static int fact(int n){
        if(n==0 || n==1 || n==2)
            return n;
        return n*fact(n-1);
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(fact(5));
    }
}
