package com.murad.chapter15.numeric_test;

/**
 * @author Murad Salmanov (legenda)
 * @created 16/04/2021 - 4:28
 * @project JavaCore
 */
public class LamdaDemo3 {
    public static void main(String[] args) {
        //В этом лямбда-выражении проверяется, является ли
        //одно число множетелем другого
        NumericTest2 factor = (n, d) -> (n % d) == 0;

        int n = (int) (Math.random() * 100 + 11); //Самодейтельность. +11 для того что бы число 'n' была больше числа 'd'
        int d = (int) (Math.random() * 10+1);     //Самодейтельность. +1 для того что бы не было деления на ноль

        boolean isFactor = factor.test(n, d);

        if (isFactor) System.out.println("Число " + d + " является множителем числа " + n);
        else System.out.println("Число " + d + " не является множителем числа " + n);
    }
}
