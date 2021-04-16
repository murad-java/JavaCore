package com.murad.chapter15.numeric_test;

/**
 * @author Murad Salmanov (legenda)
 * @created 16/04/2021 - 3:31
 * @project JavaCore
 */
public class LambdaDemo2 {
    public static void main(String[] args) {
        //Лямбда выражения проверяющее, является ли число четным
        NumericTest numericTest = (n) -> (n % 2) == 0;
        if (numericTest.test(10)) System.out.println("Число 10 четное век воли не видать.");
        if (numericTest.test(9)) System.out.println("Число 9 не четное хош верь хош нет.");

        //Тест на беременость. Ну типа отрицательность и положительность
        numericTest = n -> n >= 0; // "(n) -> n>=0" можно писать и без скобок "n -> n >=0" когда только один параметр
        boolean babyTest = numericTest.test(-1);
        if (babyTest) System.out.println("Тест положительный, выдал две полоски. Поздравляю вы станете родителем!!!");
        if (!babyTest) System.out.println("Тест отрецательный, выдал одну полоску. Попытайтесь еще раз!");
    }
}
