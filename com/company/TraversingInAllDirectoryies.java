package com.company;

import java.io.File;
import java.util.Arrays;

public class TraversingInAllDirectoryies {
    static void traverse(File folder){
        File[] files= folder.listFiles();
        for (int i = 0; i <files.length; i++) {
            if(files[i].isDirectory())
            {
                System.out.println("\n"+ files[i].getName());
                System.out.println("=====================================");

                traverse(files[i]);
                System.out.println("=====================================");
            }
            else{
                System.out.println(files[i].getName());
            }
        }
    }

    public static void main(String[] args) {
        File folder = new File("D:\\the fun know");
        if(folder.isDirectory()){
           traverse(folder);
        }
    }
}
