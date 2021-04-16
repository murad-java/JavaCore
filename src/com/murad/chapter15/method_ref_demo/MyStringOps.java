package com.murad.chapter15.method_ref_demo;

/**
 * @author Murad Salmanov (legenda)
 * @created 17/04/2021 - 1:06
 * @project JavaCore
 */
public class MyStringOps {
    static String strReverse(String str){
        String result="";
        int i;
        for(i=str.length()-1;i>=0;i--)
            result+=str.charAt(i);
        return result;
    }
}
