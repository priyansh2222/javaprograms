package com.company;

public class Money {
    int ruppee;
    int paisa;
    Money(int ruppee,int paisa){
        this.ruppee=ruppee+paisa/100;
        this.paisa=paisa%100;
    }
    Money(){
        ruppee=0;
        paisa=0;
    }
    Money add(Money p){
        this.ruppee+=p.ruppee;
        this.paisa+=p.paisa;
        return new Money(this.ruppee,this.paisa);
    }
    static Money add(Money p1,Money p2){
        int ruppee=p1.ruppee+p2.ruppee;
        int paisa=p1.paisa+p2.paisa;
        return new Money(ruppee,paisa);
    }
    public String toString(){
        return "ruppes = "+ruppee+"\npaisa = "+paisa;
    }
    public static void main(String args[]){
        Money p1=new Money(50,140);
        Money p2=new Money(60,80);
        //Money p3=p1.add(p2);
        Money p4=add(p1,p2);
        //System.out.println(p3);
        System.out.println("before addition money 1 -->");
        System.out.println(p1);
        System.out.println("Money 2 -->");
        System.out.println(p2);
        System.out.println("after additon both values --> ");
        System.out.println(p4);

    }
}
