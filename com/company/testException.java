package com.company;

import javax.swing.*;

class MoneyOverflowException extends Exception{
     String str;
        MoneyOverflowException(){
            str="Paisa Value Overloaded ";
        }
        MoneyOverflowException(String str){
            this.str=str;
        }
        public String toString() {
            return str;
        }
}
public class testException {
    public static void main(String[] args) throws MoneyOverflowException
    {
        int r = 5;
        int p = 78888;
//        try{
// if(!(p>=0 && p<=99))
//            throw new MoneyOverflowException();
//    }
//
//       catch (Exception e){
//           System.out.println(e);
//       }

        if(!(p>=0 && p<=99))
            throw new MoneyOverflowException();

        Money m1=new Money(r,p);
        System.out.println(m1);
    }
}
