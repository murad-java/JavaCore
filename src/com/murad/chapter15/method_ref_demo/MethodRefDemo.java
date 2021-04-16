package com.murad.chapter15.method_ref_demo;

/**
 * @author Murad Salmanov (legenda)
 * @created 17/04/2021 - 2:13
 * @project JavaCore
 */
public class MethodRefDemo {
    static String stringOp(StringFunc sf,String str){
        return sf.func(str);
    }

    public static void main(String[] args) {
        String inStr="Короче лямбда-афигиткльная штука";
        String outStr="";
        outStr=stringOp(MyStringOps::strReverse,inStr);
        System.out.println("Оригинал: "+inStr);
        System.out.println("Повернутая строка: "+outStr);
    }
}
