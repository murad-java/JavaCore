package com.murad.chapter15.constructor_ref_demo;

/**
 * @author Murad Salmanov (legenda)
 * @created 20/04/2021 - 2:02
 * @project JavaCore
 */
public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc myClassCons=MyClass::new;
        MyClass mc=myClassCons.func(100);

        System.out.println("Значение val в объекте mc равно: "+mc.getVal());
    }
}
