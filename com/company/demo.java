package com.company;

public class demo {
    public static void main(String args[]){
        System.out.println("in Demo class within a package ...");
        String name="paaaaaap";
        int count=0;
        for(int i=0;i<name.length()/2;i++)
        {
            if(name.charAt(i)==name.charAt(name.length()-i-1))
                count++;
            else
                break;

        }
        if(count==name.length()/2)
            System.out.println("string is  palindrom");
        else
            System.out.println("string is not palindrome ");
        System.out.println();
    }
}
