package com.murad.chapter15.numeric_func;

/**
 * @author Murad Salmanov (legenda)
 * @created 16/04/2021 - 4:51
 * @project JavaCore
 */
public class BlockLamЬdaDemo {
    public static void main(String[] args) {
        // Это блочное лямбда-выражение вычисляет
        // факториал целочисленного значения
        NumericFunc factorial = (n)->{
            int result=1;
            for(int i=1;i<=n;i++)
                result *=i;
            return result;
        };
        System.out.println("Фaктopиaл числа З равен " +factorial.func(3));
        System.out.println("Фaктopиaл числа 4 равен " +factorial.func(4));
        System.out.println("Фaктopиaл числа 5 равен " +factorial.func(5));
        System.out.println("Фaктopиaл числа 6 равен " +factorial.func(6));
    }
}
