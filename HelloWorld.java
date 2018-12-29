package com.javastep.demo;

import javax.swing.JFrame;


public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(new JFrame(){
            @Override
            public  String toString() {
                return "This is JFrame";
            }
        });

        //
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println(a+"+"+b+"="+(a+b));
        
        
    }
}
