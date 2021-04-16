package com.murad.chapter15.string_func;

/**
 * @author Murad Salmanov (legenda)
 * @created 16/04/2021 - 5:00
 * @project JavaCore
 */
public class BlockLambdaDemo2 {
    public static void main(String[] args) {


        // Это блочное выражение изменяет на обратный
        // порядок следования символов в строке
        StringFunc revers = (str) -> {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };


        System.out.println("тамат обращается на " + revers.func("тамат"));
        System.out.println("довод обращается на " + revers.func("довод"));
        System.out.println("доход обращается на " + revers.func("доход"));
        System.out.println("заказ обращается на " + revers.func("заказ"));
        System.out.println("кабак обращается на " + revers.func("кабак"));
        System.out.println("казак обращается на " + revers.func("казак"));
        System.out.println("комок обращается на " + revers.func("комок"));
        System.out.println("потоп обращается на " + revers.func("потоп"));
        System.out.println("радар обращается на " + revers.func("радар"));
        System.out.println("шабаш обращается на " + revers.func("шабаш"));
        System.out.println("шалаш обращается на " + revers.func("шалаш"));
    }
}
