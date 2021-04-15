package com.murad.chapter10;


public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;
            int[] c = {1};
            c[42] = 99;
        }catch (ArithmeticException e){
            System.out.println("Деление на ноль");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за пределы массива");
        }
        System.out.println("После блока try/catch");
    }
}
