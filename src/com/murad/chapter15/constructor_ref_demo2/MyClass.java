package com.murad.chapter15.constructor_ref_demo2;

/**
 * @author Murad Salmanov (legenda)
 * @created 20/04/2021 - 2:13
 * @project JavaCore
 */
public class MyClass<T> {
    private T val;

    public MyClass(T val) {
        this.val = val;
    }

    public MyClass() {
        val=null;
    }

    public T getVal() {
        return val;
    }
}
