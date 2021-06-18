package com.company;

public class RemoveDuplicateFromString {
    static String removeduplicates(String str)
    {if(str.isEmpty())
        return "";
        char ch=str.charAt(0);
        String ans=removeduplicates(str.substring(1,str.length()-1));
        if(ch==ans.charAt(0)){
            return ans;
        }
        return ch+ans;
}

    public static void main(String[] args) {
        System.out.println(removeduplicates("aaaabbbbvv"));
    }
}
