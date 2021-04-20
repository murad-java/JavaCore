package com.murad.chapter15.constructor_ref_demo3;

/**
 * @author Murad Salmanov (legenda)
 * @created 20/04/2021 - 6:49
 * @project JavaCore
 */
public class MyClass<T> {
    private T val;

    public MyClass(T val) {
        this.val = val;
    }

    public MyClass() {
    }

    public T getVal() {
        return val;
    }
}
