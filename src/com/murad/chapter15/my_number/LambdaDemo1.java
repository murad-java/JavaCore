package com.murad.chapter15.my_number;

/**
 * @author Murad Salmanov (legenda)
 * @created 16/04/2021 - 3:11
 * @project JavaCore
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        MyNumber number = () -> 123.3;
        System.out.println("Фиксированое значение: "+number.getValue());
        number = () -> Math.random() * 100;
        System.out.println("Случайное значение: "+number.getValue());
        System.out.println("Ctrl+D верхней стоки :) "+number.getValue());
        //number = () -> "1233"; //Это ОШИБКА. Так возвращаемые типы не совподают. Тут return скажет "ТЫ ЧË СЕБЕ ПОЗВОЛЯЕШЬ Э"
    }
}