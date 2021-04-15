package com.murad.chapter13;

import java.io.PrintWriter;

/**
 * @author Murad Salmanov (legenda)
 * @created 15/04/2021 - 21:52
 * @project JavaCore
 */
public class PrintWriteDemo {
    public static void main(String[] args) {
        PrintWriter pw=new PrintWriter(System.out,true);
        pw.println("Это строка");
        int i=-1;
        pw.println(i);
        double d=4.5e-7;
        pw.println(d);
    }
}
