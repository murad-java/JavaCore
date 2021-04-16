package com.murad.chapter15.method_ref_demo2;

/**
 * @author Murad Salmanov (legenda)
 * @created 17/04/2021 - 2:23
 * @project JavaCore
 */
public class MyStringOp {
    String strReverse(String str){
        String result="";
        int i;
        for(i=str.length()-1;i>=0;i--)
            result+=str.charAt(i);
        return result;
    }
}
