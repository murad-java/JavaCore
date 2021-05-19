package com.murad.chapter20.serialization_demo;

import java.io.Serializable;

/**
 * @author Murad Salmanov (legenda)
 * @created 15/05/2021 - 23:57
 * @project JavaCore
 */
public class MyClass implements Serializable {
    String s;
    int    i;
    double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "s='" + s + '\'' +
                ", i=" + i +
                ", d=" + d +
                '}';
    }
}
