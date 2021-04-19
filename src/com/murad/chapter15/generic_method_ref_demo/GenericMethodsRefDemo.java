package com.murad.chapter15.generic_method_ref_demo;

/**
 * @author Murad Salmanov (legenda)
 * @created 20/04/2021 - 1:22
 * @project JavaCore
 */
public class GenericMethodsRefDemo {
    static <T> int myOp(MyFunc<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 4, 5, 5, 6, 7, 7, 2, 1, 1, 2, 3, 9, 9};
        String[]  strs = {"Один", "Два", "Три", "Два"};
        int count;

        count=myOp(MyArrayOps::<Integer>countMatching,vals,4);
        System.out.println("Массив vals содержит "+count+" числа 4");

        count=myOp(MyArrayOps::countMatching,strs,"Два");
        System.out.println("Массив strs содержит "+count+" слова Два");
    }
}
