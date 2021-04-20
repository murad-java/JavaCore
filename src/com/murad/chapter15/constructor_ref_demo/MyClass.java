package com.murad.chapter15.constructor_ref_demo;

/**
 * @author Murad Salmanov (legenda)
 * @created 20/04/2021 - 2:01
 * @project JavaCore
 */
public class MyClass {
    private int val;

    public MyClass() {
        val=0;
    }

    public MyClass(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}
