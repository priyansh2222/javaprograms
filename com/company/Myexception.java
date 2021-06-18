package com.company;

public class Myexception {
 static void show() throws ArithmeticException {
     int a = 40;
     int b = 0;
     int[] arr = new int[4];
     throw new ArithmeticException();
//     try{
//         throw new ArithmeticException();
//
//
//     }
//     catch (ArithmeticException e){
//         System.out.println(e.getMessage());
//
//     }
//     catch (ArrayIndexOutOfBoundsException e){
//         System.out.println(e);
//     }
//
//     finally {
//         System.out.println("i am finally ");
//     }
//     System.out.println("i am jaruri");
//
//
//}
 }
 static  void show2(){
     show();
 }

    public static void main(String[] args) {
        try {
            show2();
        } catch (ArithmeticException e) {

            System.out.println(e.getStackTrace());

        }
    }
}
