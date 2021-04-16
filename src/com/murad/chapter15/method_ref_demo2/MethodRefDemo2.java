package com.murad.chapter15.method_ref_demo2;

/**
 * @author Murad Salmanov (legenda)
 * @created 17/04/2021 - 2:24
 * @project JavaCore
 */
public class MethodRefDemo2 {
    static String stringOp(StringFunc sf, String str){
        return sf.func(str);
    }

    public static void main(String[] args) {
        String inStr="Если ты читаешь эту строку,то знай, что я от всей души желаю тебе всего самого наилучшего в жизни.";
        String outStr="";
        MyStringOp stringRev =new MyStringOp();

        outStr=stringOp(stringRev::strReverse,inStr);
        System.out.println("Исходник: "+inStr);
        System.out.println("Перевертыш: "+outStr);
    }
}
