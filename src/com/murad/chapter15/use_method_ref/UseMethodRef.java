package com.murad.chapter15.use_method_ref;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author Murad Salmanov (legenda)
 * @created 20/04/2021 - 1:42
 * @project JavaCore
 */
public class UseMethodRef {
    static int compareMC(MyClass a,MyClass b){
        return a.getVal()-b.getVal();
    }

    public static void main(String[] args) {
        ArrayList<MyClass> al=new ArrayList<>();
        al.add(new MyClass(1));
        al.add(new MyClass(4));
        al.add(new MyClass(2));
        al.add(new MyClass(9));
        al.add(new MyClass(3));
        al.add(new MyClass(7));
        //Находим Максимальное значение с помощью compareMC

        MyClass maxValObj= Collections.max(al,UseMethodRef::compareMC);
        System.out.println("Максимальное значение равно: "+maxValObj.getVal());
    }
}
