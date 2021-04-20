package com.murad.chapter15.use_function_interface_demo;

import java.util.function.Function;

/**
 * @author Murad Salmanov (legenda)
 * @created 20/04/2021 - 7:17
 * @project JavaCore
 */
public class UseFunctionInterfaceDemo {
    public static void main(String[] args) {
        Function<Integer,Integer> factorial=n->{
            int result=1;
            for(int i=1;i<=n;i++)
                result*=i;
            return result;
        };
        System.out.println("Факториал числа 3 равен: "+factorial.apply(3));
        System.out.println("Факториал числа 5 равен: "+factorial.apply(5));
        System.out.println("Факториал числа 10 равен: "+factorial.apply(10));
    }
}
