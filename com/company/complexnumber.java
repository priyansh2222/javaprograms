package com.company;

public class complexnumber {
    int real;
    int imag;
    complexnumber(){
        real=0;
        imag=0;
    }
    complexnumber(int real,int imag){
        this.real=real;
        this.imag=imag;
    }
    static complexnumber add(complexnumber p1,complexnumber p2){
        int real= p1.real+ p2.real;
        int imag= p2.imag+ p1.imag;
        return  new complexnumber(real,imag);
    }
    public String toString(){
        return "real no = "+real+"\nimag no = "+imag;
    }
    public static void main(String args[]){
        complexnumber c1=new complexnumber(44,22);
        complexnumber c2=new complexnumber(22,48);
        complexnumber c3=add(c1,c2);
        System.out.println(c3);
    }
}
