package com.murad.chapter15.constructor_ref_demo3;

/**
 * @author Murad Salmanov (legenda)
 * @created 20/04/2021 - 6:53
 * @project JavaCore
 */
public class ConstructorRefDemo3 {
    static <R,T> R myClassFactory(MyFunc<R,T> cons,T v){
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFunc<MyClass<Double>,Double> myClassCons=MyClass<Double>::new;
        MyClass<Double> mc=myClassFactory(myClassCons,100.1);
        System.out.println("Значение val в объекте mc: "+mc.getVal());

        MyFunc<MyClass2,String> myClassCons2=MyClass2::new;
        MyClass2 mc2=myClassFactory(myClassCons2,"Лябда");
        System.out.println("Значение str в объекте mc2: "+mc2.getStr());
    }
}
