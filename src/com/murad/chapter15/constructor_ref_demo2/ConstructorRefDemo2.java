package com.murad.chapter15.constructor_ref_demo2;

/**
 * @author Murad Salmanov (legenda)
 * @created 20/04/2021 - 2:15
 * @project JavaCore
 */
public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        MyFunc<Integer> myClassCons=MyClass<Integer>::new;
        MyClass<Integer> mc=myClassCons.func(200);

        System.out.println("Значение val в объекте mc равно: "+mc.getVal());
    }
}
