package com.murad.chapter15.generic_method_ref_demo;

/**
 * @author Murad Salmanov (legenda)
 * @created 20/04/2021 - 1:17
 * @project JavaCore
 */
public class MyArrayOps {
    static <T> int countMatching(T[] vals, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++)
            if (vals[i] == v) count++;

        return count;
    }
}
