package com.company;
import java.io.*;
import java.util.Arrays;

public class fileOperation {

    public static void main(String[] args) {
       // File f=new File("C:\\Users\\LENOVO\\Desktop\\course\\DBMS\\2.png");
       // File f=new File("C:\\Users\\LENOVO\\Desktop\\course\\DBMS");

        //File f=new File("demo.class");
        File f=new File("src/demo.java");
//        File f=new File("C:\\Users\\LENOVO\\IdeaProjects\\myjavapractice\\src\\com\\company\\demo.java");
//
//        System.out.println(f.canExecute());
//        System.out.println(f.canRead());
//        System.out.println(f.getAbsoluteFile());
//        System.out.println(f.getName());
//        System.out.println(f.isDirectory());
//        System.out.println(f.exists());
//
//        System.out.println(f.exists());
        try {FileInputStream fis = new FileInputStream(f);
            int n=fis.available();
            byte[] b= new byte[n];
          if(fis.read(b,0,n)!=n){
              System.out.println("file not ..");
          }
          else{
              System.out.println( new String(b,0,n));
          }

        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
