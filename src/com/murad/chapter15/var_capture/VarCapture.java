package com.murad.chapter15.var_capture;

/**
 * @author Murad Salmanov (legenda)
 * @created 17/04/2021 - 0:40
 * @project JavaCore
 */
public class VarCapture {
    public static void main(String[] args) {
        //Лямбда выражения и захват переменных
        int num=10;
        MyFunc myFunc=n -> {
            int v=num+n;
            //num++ приведет к ошибке так как видо изменяется значение переменной num
            return v;
        };
        //num=9 так тоже нельзя по скольки нарушается завершенная состояное переменной num
    }
}
