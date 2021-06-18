package com.company;

public class ReplacePi {
    static void replacepi(String str){
        if(str.isEmpty())
            return ;
        if(str.charAt(0)=='p'&&str.charAt(1)=='i') {
            System.out.print("3.14");
        replacepi(str.substring(2));
        }   else
        {
            System.out.print(str.charAt(0));
            replacepi(str.substring(1));

        }
    }

    public static void main(String[] args) {
        String str ="pijaytipi";
        replacepi(str);
    }
}
